package ex06.collection_pra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//제목, 장르, 대여, 대여자(고객명), 대여날짜(오늘날짜)
//
//추가 / 출력 / 수정 / 삭제 / 종료 
public class Video {
	ArrayList namelist = new ArrayList();
	ArrayList genrlist = new ArrayList();
	ArrayList userlist = new ArrayList();

	Scanner sc = new Scanner(System.in);
	
	public Video() {
		int num=0;
		do{
		System.out.println();
		System.out.println("원하는 메뉴를 선택하세요");
		System.out.println("1.비디오 정보 추가  2.비디오정보 출력 3.비디오정보 검색  4.비디오 정보 수정  5.비디어 정보 삭제 6.프로그램 종료");
		num=sc.nextInt();
		switch(num){
		case 1: videoinput(); break;
		case 2: disp(); break;
		case 3: searchmanual(); break;
		case 4: modi(); break;
		case 5:remove(); break;
		case 6: System.out.println("프로그램을 종료합니다"); System.exit(0); break;
		}
		
	}while(true);
	}
	public void videoinput(){
		int num=0;
		String str=" ";
		System.out.println("추가할 비디오가 몇개입니까? ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<num; i++){
			System.out.println((i+1)+"번째 비디오의 이름 장르 대여자를 입력해주세요(대여자가 없으면 n입력) ");
			namelist.add(sc.next());
			genrlist.add(sc.next());
			str = sc.next();
			char ch = str.charAt(0);
			if((ch=='n')|(ch=='N'))
				userlist.add(new String("noUser"));
			else
				userlist.add(str);
		}//for end
	}//video input end
	
	
		public void disp(){
			
			System.out.println();
			System.out.println("video의 목록입니다(알파벳 순)");
			Collections.sort(namelist);
			for(int i=0; i<namelist.size(); i++){
				System.out.print(namelist.get(i)+"\t");
				System.out.print(genrlist.get(i)+"\t");
				System.out.println(userlist.get(i));
			}
	
			
		} // disp end
		
		public void searchmanual(){
			char ch =' ';
			String str="";
			int num=0;
			System.out.println();
			System.out.println("검색을 원하세요? (y/n)");
			str=sc.next();
			ch=str.charAt(0);
			
			if((ch=='y')|(ch=='Y')){
				System.out.println();
				System.out.println("검색할 방법을 선택하세요 : 1.이름  2. 장르  3. 사용자");
				num = sc.nextInt();
				switch(num){
					case 1 : {
						System.out.println("찾고자 하는 이름이 무엇입니까?");
						str=sc.next();
						search(str,1);
						break;
					}
					case 2 :{
						System.out.println("찾고자 하는 장르가 무엇입니까?");
						str=sc.next();
						search(str,2);
						break;
					}
					case 3 :{
						System.out.println("찾고자 하는 사용자가 누구입니까?");
						str=sc.next();
						search(str,3);
						break;
					}
				} // switch end		
			}//if end
			else if((ch=='n')|(ch=='N'))
				System.out.println("메뉴로 돌아갑니다");
			else System.out.println("error");
			
		
		}
		
		public void search(String name, int num){
			int  temp =0;
			if(num==1) temp = namelist.indexOf(name);
			else if(num==2) temp = genrlist.indexOf(name);
			else if(num ==3)temp = userlist.indexOf(name);
			
			if(temp==-1) System.out.println("찾을 수 없습니다. 메뉴로 돌아갑니다");
			else{
			System.out.println();
			System.out.println(name+"에 관한 정보를 찾았습니다.");
			System.out.print(namelist.get(temp)+"\t");
			System.out.print(genrlist.get(temp)+"\t");
			System.out.println(userlist.get(temp));
			}
		} // search end

		public void modi(){
			String name=" ",str = " ";
			int  temp =0, num=0;
			System.out.println("수정하고 싶은 video의 이름을 입력하세요");
			sc.nextLine();
			name = sc.nextLine();
			temp = namelist.indexOf(name);
			if(temp==-1) System.out.println("찾을 수 없습니다. 메뉴로 돌아갑니다.");
			else{
			System.out.println("변경하고 싶은 부분은 어디입니까? 1.이름 2.장르 3.User");
			num=sc.nextInt();
			switch(num){
			case 1: {
				System.out.println("변경하고 싶은 이름을 작성하세요");
				sc.nextLine();
				str = sc.nextLine();
				namelist.set(temp, str);
				System.out.println("변경되었습니다.");
				break;
			}
			case 2: {
				System.out.println("변경하고 싶은 장르을 작성하세요");
				sc.nextLine();
				str = sc.nextLine();
				genrlist.set(temp, str);
				System.out.println("변경되었습니다.");
				break;
			}
			case 3: {
				System.out.println("변경하고 싶은 User를 작성하세요");
				sc.nextLine();
				str = sc.nextLine();
				userlist.set(temp, str);
				System.out.println("변경되었습니다.");
				break;
			}
		
			} //switch end
			
			System.out.print(namelist.get(temp)+"\t");
			System.out.print(genrlist.get(temp)+"\t");
			System.out.println(userlist.get(temp));
			}
		}
		
		public void remove(){
			String name=" ",str = " ";
			int temp =0, num=0;
			System.out.println("삭제하고 싶은 video의 이름을 입력하세요");
			
			sc.nextLine();
			name = sc.nextLine();
			temp = namelist.indexOf(name);
			if(temp==-1) System.out.println("찾을 수 없습니다. 메뉴로 돌아갑니다.");
			else{
			namelist.remove(temp);
			genrlist.remove(temp);
			userlist.remove(temp);
			
			System.out.println("삭제되었습니다. 확인하시겠습니까? (y/n)");
			str = sc.next();
			char ch = str.charAt(0);
			
			if((ch=='y')|(ch=='Y')){
				for(int i=0; i<namelist.size(); i++){
					System.out.print(namelist.get(i)+"\t");
					System.out.print(genrlist.get(i)+"\t");
					System.out.println(userlist.get(i));
				}// for end
				
			}// if end
			else if((ch=='n')|(ch=='N'))
				System.out.println("메뉴로 돌아갑니다");
			else System.out.println("error");
			}
			
		}
	}

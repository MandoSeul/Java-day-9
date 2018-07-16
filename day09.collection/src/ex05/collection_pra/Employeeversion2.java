package ex05.collection_pra;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Employeeversion2 {
	LinkedList namelist = new LinkedList();
	LinkedList addrlist = new LinkedList();
	LinkedList tellist = new LinkedList();
	Scanner sc = new Scanner(System.in);
	
	public Employeeversion2() {
		
		int num=0;
		System.out.println("직원이 몇명이에요? ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<num; i++){
			System.out.println((i+1)+"번째 직원의 이름 주소 전화번호를 입력해주세요 ");
			namelist.add(sc.next());
			addrlist.add(sc.next());
			tellist.add(sc.next());
		}
	}
		public void disp(){
			char ch =' ';
			String str="";
			int num=0;
			System.out.println();
			System.out.println("직원의 목록입니다(가나다 or 알파벳 순)");
			Collections.sort(namelist);
			for(int i=0; i<namelist.size(); i++){
				System.out.print(namelist.get(i)+"\t");
				System.out.print(addrlist.get(i)+"\t");
				System.out.println(tellist.get(i));
			}
				System.out.println();
				System.out.println("검색을 원하세요? (y/n)");
				str=sc.next();
				ch=str.charAt(0);
				
				if((ch=='y')|(ch=='Y')){
					System.out.println();
					System.out.println("검색할 방법을 선택하세요 : 1.이름  2. 주소  3. 전화번호");
					num = sc.nextInt();
					switch(num){
						case 1 : {
							System.out.println("찾고자 하는 이름이 무엇입니까?");
							str=sc.next();
							search(str,1);
							break;
						}
						case 2 :{
							System.out.println("찾고자 하는분의  주소가 무엇입니까?");
							str=sc.next();
							search(str,2);
							break;
						}
						case 3 :{
							System.out.println("찾고자 하는 분의 전화번호가 무엇입니까?");
							str=sc.next();
							search(str,3);
							break;
						}
					} // switch end		
				}//if end
				else if((ch=='n')|(ch=='N'))
					System.out.println("끝입니다");
				else System.out.println("error");
				
			
			
		} // disp end
		
		public void search(String name, int num){
			int count =0, temp =0;
			if(num==1) temp = namelist.indexOf(name);
			else if(num==2) temp = addrlist.indexOf(name);
			else if(num ==3)temp = tellist.indexOf(name);
			if(temp==-1) System.out.println("찾을 수 없습니다. 메뉴로 돌아갑니다");
			else{
			System.out.println();
			System.out.println(name+"에 관한 정보를 찾았습니다.");
			System.out.print(namelist.get(temp)+"\t");
			System.out.print(addrlist.get(temp)+"\t");
			System.out.println(tellist.get(temp));
			}
			
		} // search end

	
	}

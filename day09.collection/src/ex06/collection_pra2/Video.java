package ex06.collection_pra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//����, �帣, �뿩, �뿩��(����), �뿩��¥(���ó�¥)
//
//�߰� / ��� / ���� / ���� / ���� 
public class Video {
	ArrayList namelist = new ArrayList();
	ArrayList genrlist = new ArrayList();
	ArrayList userlist = new ArrayList();

	Scanner sc = new Scanner(System.in);
	
	public Video() {
		int num=0;
		do{
		System.out.println();
		System.out.println("���ϴ� �޴��� �����ϼ���");
		System.out.println("1.���� ���� �߰�  2.�������� ��� 3.�������� �˻�  4.���� ���� ����  5.���� ���� ���� 6.���α׷� ����");
		num=sc.nextInt();
		switch(num){
		case 1: videoinput(); break;
		case 2: disp(); break;
		case 3: searchmanual(); break;
		case 4: modi(); break;
		case 5:remove(); break;
		case 6: System.out.println("���α׷��� �����մϴ�"); System.exit(0); break;
		}
		
	}while(true);
	}
	public void videoinput(){
		int num=0;
		String str=" ";
		System.out.println("�߰��� ������ ��Դϱ�? ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<num; i++){
			System.out.println((i+1)+"��° ������ �̸� �帣 �뿩�ڸ� �Է����ּ���(�뿩�ڰ� ������ n�Է�) ");
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
			System.out.println("video�� ����Դϴ�(���ĺ� ��)");
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
			System.out.println("�˻��� ���ϼ���? (y/n)");
			str=sc.next();
			ch=str.charAt(0);
			
			if((ch=='y')|(ch=='Y')){
				System.out.println();
				System.out.println("�˻��� ����� �����ϼ��� : 1.�̸�  2. �帣  3. �����");
				num = sc.nextInt();
				switch(num){
					case 1 : {
						System.out.println("ã���� �ϴ� �̸��� �����Դϱ�?");
						str=sc.next();
						search(str,1);
						break;
					}
					case 2 :{
						System.out.println("ã���� �ϴ� �帣�� �����Դϱ�?");
						str=sc.next();
						search(str,2);
						break;
					}
					case 3 :{
						System.out.println("ã���� �ϴ� ����ڰ� �����Դϱ�?");
						str=sc.next();
						search(str,3);
						break;
					}
				} // switch end		
			}//if end
			else if((ch=='n')|(ch=='N'))
				System.out.println("�޴��� ���ư��ϴ�");
			else System.out.println("error");
			
		
		}
		
		public void search(String name, int num){
			int  temp =0;
			if(num==1) temp = namelist.indexOf(name);
			else if(num==2) temp = genrlist.indexOf(name);
			else if(num ==3)temp = userlist.indexOf(name);
			
			if(temp==-1) System.out.println("ã�� �� �����ϴ�. �޴��� ���ư��ϴ�");
			else{
			System.out.println();
			System.out.println(name+"�� ���� ������ ã�ҽ��ϴ�.");
			System.out.print(namelist.get(temp)+"\t");
			System.out.print(genrlist.get(temp)+"\t");
			System.out.println(userlist.get(temp));
			}
		} // search end

		public void modi(){
			String name=" ",str = " ";
			int  temp =0, num=0;
			System.out.println("�����ϰ� ���� video�� �̸��� �Է��ϼ���");
			sc.nextLine();
			name = sc.nextLine();
			temp = namelist.indexOf(name);
			if(temp==-1) System.out.println("ã�� �� �����ϴ�. �޴��� ���ư��ϴ�.");
			else{
			System.out.println("�����ϰ� ���� �κ��� ����Դϱ�? 1.�̸� 2.�帣 3.User");
			num=sc.nextInt();
			switch(num){
			case 1: {
				System.out.println("�����ϰ� ���� �̸��� �ۼ��ϼ���");
				sc.nextLine();
				str = sc.nextLine();
				namelist.set(temp, str);
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			case 2: {
				System.out.println("�����ϰ� ���� �帣�� �ۼ��ϼ���");
				sc.nextLine();
				str = sc.nextLine();
				genrlist.set(temp, str);
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			case 3: {
				System.out.println("�����ϰ� ���� User�� �ۼ��ϼ���");
				sc.nextLine();
				str = sc.nextLine();
				userlist.set(temp, str);
				System.out.println("����Ǿ����ϴ�.");
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
			System.out.println("�����ϰ� ���� video�� �̸��� �Է��ϼ���");
			
			sc.nextLine();
			name = sc.nextLine();
			temp = namelist.indexOf(name);
			if(temp==-1) System.out.println("ã�� �� �����ϴ�. �޴��� ���ư��ϴ�.");
			else{
			namelist.remove(temp);
			genrlist.remove(temp);
			userlist.remove(temp);
			
			System.out.println("�����Ǿ����ϴ�. Ȯ���Ͻðڽ��ϱ�? (y/n)");
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
				System.out.println("�޴��� ���ư��ϴ�");
			else System.out.println("error");
			}
			
		}
	}

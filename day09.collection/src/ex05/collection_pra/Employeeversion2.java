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
		System.out.println("������ ����̿���? ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<num; i++){
			System.out.println((i+1)+"��° ������ �̸� �ּ� ��ȭ��ȣ�� �Է����ּ��� ");
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
			System.out.println("������ ����Դϴ�(������ or ���ĺ� ��)");
			Collections.sort(namelist);
			for(int i=0; i<namelist.size(); i++){
				System.out.print(namelist.get(i)+"\t");
				System.out.print(addrlist.get(i)+"\t");
				System.out.println(tellist.get(i));
			}
				System.out.println();
				System.out.println("�˻��� ���ϼ���? (y/n)");
				str=sc.next();
				ch=str.charAt(0);
				
				if((ch=='y')|(ch=='Y')){
					System.out.println();
					System.out.println("�˻��� ����� �����ϼ��� : 1.�̸�  2. �ּ�  3. ��ȭ��ȣ");
					num = sc.nextInt();
					switch(num){
						case 1 : {
							System.out.println("ã���� �ϴ� �̸��� �����Դϱ�?");
							str=sc.next();
							search(str,1);
							break;
						}
						case 2 :{
							System.out.println("ã���� �ϴº���  �ּҰ� �����Դϱ�?");
							str=sc.next();
							search(str,2);
							break;
						}
						case 3 :{
							System.out.println("ã���� �ϴ� ���� ��ȭ��ȣ�� �����Դϱ�?");
							str=sc.next();
							search(str,3);
							break;
						}
					} // switch end		
				}//if end
				else if((ch=='n')|(ch=='N'))
					System.out.println("���Դϴ�");
				else System.out.println("error");
				
			
			
		} // disp end
		
		public void search(String name, int num){
			int count =0, temp =0;
			if(num==1) temp = namelist.indexOf(name);
			else if(num==2) temp = addrlist.indexOf(name);
			else if(num ==3)temp = tellist.indexOf(name);
			if(temp==-1) System.out.println("ã�� �� �����ϴ�. �޴��� ���ư��ϴ�");
			else{
			System.out.println();
			System.out.println(name+"�� ���� ������ ã�ҽ��ϴ�.");
			System.out.print(namelist.get(temp)+"\t");
			System.out.print(addrlist.get(temp)+"\t");
			System.out.println(tellist.get(temp));
			}
			
		} // search end

	
	}

package ex05.collection_pra;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Employee {
	
	LinkedList list = new LinkedList();
	
	public Employee() {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����̿���? ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<num; i++){
			System.out.println("������ �̸� �ּ� ��ȭ��ȣ�� �Է����ּ��� ");
			list.add(sc.nextLine());
		}
		
	}
		public void output(){
		
		Collections.sort(list);
		System.out.println("������ or ���ĺ� �����Դϴ� : ");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}	

	}
	
	
	
}

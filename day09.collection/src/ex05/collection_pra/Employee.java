package ex05.collection_pra;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Employee {
	
	LinkedList list = new LinkedList();
	
	public Employee() {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("직원이 몇명이에요? ");
		num = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<num; i++){
			System.out.println("직원의 이름 주소 전화번호를 입력해주세요 ");
			list.add(sc.nextLine());
		}
		
	}
		public void output(){
		
		Collections.sort(list);
		System.out.println("가나다 or 알파벳 순서입니다 : ");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}	

	}
	
	
	
}

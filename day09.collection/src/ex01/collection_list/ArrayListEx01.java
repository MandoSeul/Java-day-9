package ex01.collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(105));
		list1.add(new Integer(150));
		list1.add(new Integer(25));
		list1.add(new Integer(65));
		list1.add(new Integer(85));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// ���� �� ����, ���Ѱ� ������
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
	//containsAll - > boolean
		list2.add("B");list2.add("Adfs");
		list2.add(3,"A");
		print(list1, list2);
		
		list2.set(3, "kk"); // ��ü
		print(list1,list2);
		
		System.out.println("List1.retainAll(list2) : " + list1.retainAll(list2));
		// retainAll ����� ��ü�߿��� �־��� �÷��ǰ� ����� �͵鸸 ����� ������ ����(������)
		print(list1,list2); // list1�� ������
		
		for(int i=list2.size()-1; i>=0; i-- ){
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);
 	}

	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list 1 : " + list1 );
		System.out.println("list 2 : " + list2 );
		
	}
}

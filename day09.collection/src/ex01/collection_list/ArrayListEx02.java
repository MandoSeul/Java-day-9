package ex01.collection_list;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;

public class ArrayListEx02 {
	public static void main(String[] args) {
		final int LIMIT = 10; // LIMIT ���ȭ��. - > �߰��� �� �ٲ� �� ����.
		String source = "0123456789abcdefghthyjj%$^$^&%*%&^@";
		int length = source.length();
		System.out.println(length); //35
		//set->interface ��, hashset�� set�� implements list�� ��������
		// set, list���� ��ü������ ��ü ���� �Ұ��� - > �ڼ����� ����
		List list = new ArrayList(length/LIMIT +10); // �������ذ����Ҵ�
		
		for (int i = 0; i < length; i+=LIMIT) {
			if(i+LIMIT < length )
			list.add(source.substring(i, i+LIMIT));
			else
			list.add(source.substring(i));
		} // for end
		
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

package ex01.collection_list;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;

public class ArrayListEx02 {
	public static void main(String[] args) {
		final int LIMIT = 10; // LIMIT 상수화됨. - > 중간에 값 바꿀 수 없음.
		String source = "0123456789abcdefghthyjj%$^$^&%*%&^@";
		int length = source.length();
		System.out.println(length); //35
		//set->interface 즉, hashset은 set을 implements list도 마찬가지
		// set, list등은 자체적으로 객체 생성 불가능 - > 자손으로 가능
		List list = new ArrayList(length/LIMIT +10); // 복제위해공간할당
		
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

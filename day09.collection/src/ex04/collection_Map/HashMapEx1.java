package ex04.collection_Map;

import java.util.*;
class HashMapEx1{
	public static void main(String[] args) {
		HashMap map = new HashMap(); // <> 을 안하면 꺼내올때 형변환을 해야함
		map.put("kosta", "1234");
		map.put("asdf", "1111");//key 중복허용하지 않음
		map.put("asdf", "1234");
		Scanner s = new Scanner(System.in);	
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();//입력받은 id문자열에 공백이 있으면 제거
			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
				 System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");						
					break;
				}
			}
		} 
	} 
}
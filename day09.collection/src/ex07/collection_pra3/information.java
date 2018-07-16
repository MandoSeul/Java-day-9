package ex07.collection_pra3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class information {
	public static void main(String[] args) {
		HashMap  <String, String> map2 = new HashMap();
		map2.put("hi","nabb");
		map2.put("hi2","nab4b");
		map2.put("hi3","na4bb");
		
		System.out.println(map2.size());
		
		//map에서는 바로 interator을 꺼내오지 못함 iterator it = map.itorator()을 못함 set이용
		Set set = map2.entrySet();
		System.out.println(set);
		Iterator it = set.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());

	}
	
		set = map2.keySet();
		System.out.println(set);
		
		Collection values = map2.values();
		System.out.println(values);
		
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}}

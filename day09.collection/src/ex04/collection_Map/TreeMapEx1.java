package ex04.collection_Map;

import java.util.*;
class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("È«±æµ¿",1000);
		tm.put("±è±æµ¿",1000);
		tm.put("ÀÌ±æµ¿",1000);
		tm.put("È²±æµ¿",1000);
		System.out.println("È«±æµ¿ : "+tm.get("È«±æµ¿"));
		System.out.println(tm);
	}
}

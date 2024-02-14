package edu.kh.collection.pack3.model.service;

import java.util.HashMap;

public class MapService {

	public void method1() {
		Map<Integer,String> map = new HashMap<Integer, String>();
		

		System.out.println(map.put(1, "에그마요"));
		System.out.println(map.put(2, "로티세리바베큐"));
		System.out.println(map.put(3, "스테이크앤치즈"));
		System.out.println(map.put(3, "스파이시쉬림프")); // 3중복
		
		System.out.println(map);
		
	}
	
	
}

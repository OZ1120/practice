package edu.kh.collection.pack2.model.service;

import java.util.HashSet;
import java.util.Set;

public class SetService {

	// HashSet 사용법
	public void method1() {
		Set<String> set = new HashSet<String>();
// String만 저장하는 set만듬
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		
		System.out.println(set);
		
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");

		System.out.println(set);
		
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println(set);
		
		// 2. int size() : set에 저장된 객체(참조변수)의 수 반환
		System.out.println("set.size() : " + set.size());
		
		
		// 3. boolean remove(E e)
		System.out.println(set.remove("배달의민족"));
		System.out.println(set.remove("유플러스"));
		
		System.out.println(set);

		// 4. boolean contains(E e) : 
		System.out.println(set.contains("쿠팡"));
		System.out.println("삼성 있는지 확인 : "+set.contains("삼성"));

		// 5. void clear() : Set에 저장된 내용 모두 삭제
		set.clear();
		System.out.println(set);
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println("비어있음?? : " + set.isEmpty());
	
	} // HashSet 메서드 확인 코드
	
	
}

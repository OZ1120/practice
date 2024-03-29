package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edu.kh.collection.pack2.model.dto.Person;

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
	
	// Set에 저장된 요소(객체)를 꺼내는 방법
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("일본");
		set.add("미국");
		set.add("중국");
		set.add("영국");
		set.add("프랑스");
		
		// 현재 Set 순차접근 가능한 Iterator 객체 반환
		Iterator<String> it = set.iterator();
		
		
		System.out.println("[Iterator]");
		while(it.hasNext()) {
			//다음요소 있음 반복 없음 멈춤
			
			String temp = it.next();
			System.out.println(temp);
		}

		System.out.println("--------------------------------------");
		System.out.println("[List로 변환]");
		
		// set -> list  객체사용 list생성
		List<String> list = new ArrayList<String>(set);
		
		for(int i=0; i<list.size() ;i++) {
			System.out.println(list.get(i));
								// 가져와 얻어와
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("[향상된 for문]");
		
		for(String snack : set) {
			System.out.println(snack);
		}
	}
	
	public void method3() {
		
		Person p1 = new Person("홍길동", 25, '남'); 
		Person p2 = new Person("홍길동", 25, '남'); 
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여'); 

		System.out.println("p1 : " + p1.hashCode());// 번호 같음
		System.out.println("p2 : " + p2.hashCode());// 번호 같음
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());// -나오는건 오버플로우되어서
		
		// 값이 같다면 true, 다르면 false
		System.out.println(p1.equals(p4));
		System.out.println(p1.equals(p2));

		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);

		System.out.println("-------------------------------------");
		for(Person p : personSet) {
			System.out.println(p); // 25세 홍길동이 한번만 출력! 중복 제거됨
		}
		// 오버라이딩 제대로 안해놓으면 안된다
		// hash 컬렉션 이용할때 hashCode(), equals() 오버라이딩 꼭 해라
	}
	
	
	
}

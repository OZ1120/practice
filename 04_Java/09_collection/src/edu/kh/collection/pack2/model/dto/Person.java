package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	private char gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	//객체의 중복 판별
	// 동일, 동등 비교
	
	//동일 비교 : Object.hashCode()메서드 오버라이딩
	
	@Override // 오버라이딩 잘하고 있는지 검사
	public int hashCode() {
		
		// 필드에 저장된 값을 이용해서 hashCode생성
//		return name.hashCode()+ age * 31 + gender *31 ;
		// Objects : Object 관련 유용한 기능 모음
		return Objects.hash(name, age, gender);
		
	}
	
	
	// 동등 비교 : Object.equals() 메서드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		
		if(obj==null) return false;
		// 전달 받아온 객체와 현재객체 , 비교대상이 현재객체= 나랑 나를 어떻게 비교함?
		if(obj == this) return true;
		//obj 가 참조하는  객체가 person이 아니라면
		// 같은 type이 아니면 비교 불가
		if(!(obj instanceof Person )) return false;

		Person other = (Person)obj;
		
		return name.equals(other.name) && age == other.age && gender==other.gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

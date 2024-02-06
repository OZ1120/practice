package edu.kh.ingeritance.model.dto;


public class Child1 extends Parent {
	
	// 자식만 가지고 있는거 : 예를 들면 컴퓨터
	// 필드
	private String computer;
	
	public Child1() {
		
		System.out.println("Clid1 기본 생성자로 생성");
	}
	
	public Child1(String computer) {
		
		this.computer = computer;
		System.out.println("Child1 매개변수 생성자로 생성");
	}

	//getter/setter
	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}
	
	
	

	
	
	
}//






package edu.kh.ingeritance.model.dto;

public class Parent {
	
	public String lastName = "홍";
	protected String address = "서울시 중구 남대문로";
	
	private int money = 10_000_000; // 1억
	private String car = "그랜져";


	public Parent() {
		System.out.println("기본 생성자로 부모 객체 생성됨");
	}
	
	// 매개변수 형태가 같아서 오류
	public Parent(String lastName, String address, int money, String car) {
		this.address = address;
		this.lastName = lastName;
		this.car = car;
		this.money = money;
		
		System.out.println("매개 면수 생성자로 부모 객체 생성됨");
	}

	// getter : 얻어오다 (외부로 얻어 갈수 있다-반환해야함)
	public int getMoney() {
		return money;
	}
 
	// setter : 외부 전달값 셋팅한다 전달받으려면 매개 변수 이용해야함
	public void setMoney(int money) {
		this.money = money;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	

	// 현재 객체의 필드를 문자열로 반환하는 메서드
	public String inform() {
		return String.format("%s / %s / %d / %s", lastName, address, money, car);
	}

}

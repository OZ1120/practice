package edu.kh.poly.pack1.moedl.dto;
// 부모 클래스

public class SmartPhone {

	private String display;
	private String newsAgency;
	private String ap; // cpu
	
	public SmartPhone() {
		super();
	}
	
	public SmartPhone(String display, String newsAgency, String ap) {
		super();
		this.display = display;
		this.newsAgency = newsAgency;
		this.ap = ap;
	}
	
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getDisplay() {
		return display;
	}

	public String getNewsAgency() {
		return newsAgency;
	}

	public void setNewsAgency(String newsAgency) {
		this.newsAgency = newsAgency;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}
	
	@Override
	public String toString() {
		return "스마트폰 = " + display + newsAgency + ap ;
	}
	
	
	
}

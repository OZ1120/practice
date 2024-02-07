package edu.kh.poly.pack1.moedl.dto;

public class Galaxy extends SmartPhone {
	
	private int androidVersion;
	
	public Galaxy() {}

	public Galaxy(String display, String newsAgency, String ap, int androidVersion) {
		super(display, newsAgency, ap);
		this.androidVersion = androidVersion;
	}

	
	
	public int getAndroidVersion() {
		return androidVersion;
	}

	public void setAndrodVersion(int androdVersion) {
		this.androidVersion = androdVersion;
	}

	@Override
	public String toString() {
		return "Galaxy AndroidVersion : " + androidVersion + " / " + super.toString();
	}
	
	
	
	
	
	
	
	
	

}

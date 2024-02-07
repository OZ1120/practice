package edu.kh.poly.pack1.moedl.service;

import edu.kh.poly.pack1.moedl.dto.Galaxy;
import edu.kh.poly.pack1.moedl.dto.Iphone;
import edu.kh.poly.pack1.moedl.dto.SmartPhone;

public class PolyService {
	
	public void method1() {

		//업캐스팅
		SmartPhone s1 = new Iphone();
		SmartPhone s2 = new Galaxy();
		
		s1.setDisplay("레티나 디스플레이");
		s2.setDisplay("AMOLED");
		
		System.out.println(s1.getDisplay());
		System.out.println(s2.getDisplay());
		
		//대신 자식 기능은 불러올수 없음...
		// 이미 부모만 읽힘, 자식 안보임...

		
		
		
		
	}
	
	public void method2() {
		// 업캐스팅 상태에서
		SmartPhone s1 = new Iphone();
		SmartPhone s2 = new Galaxy();
		
		// 다운캐스팅
		int v1 = ((Iphone)s1).getIosVersion();
		int v2 = ((Galaxy)s2).getAndroidVersion();
		
		Iphone i1 = (Iphone)s1; // s1을 강제 형변환해서 타입 맞춰야함
		
		i1.setIosVersion(20);
		
		System.out.println("ios버전 : " + i1.getIosVersion());
		
		
	}

}

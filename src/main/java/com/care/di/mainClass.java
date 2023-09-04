package com.care.di;

public class mainClass {
	public static void main(String[] args) {
		STBean stBean = new STBean();//저장
		stBean.setName("길동이");
		stBean.setAge(20);
		stBean.setSt(new Student());//출력
		
		stBean.agePrint();
		stBean.namePrint();
	}
}

package com.care.di;

public class mainClass {
	public static void main(String[] args) {
		STBean stBean = new STBean();//����
		stBean.setName("�浿��");
		stBean.setAge(20);
		stBean.setSt(new Student());//���
		
		stBean.agePrint();
		stBean.namePrint();
	}
}

package com.care.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.di_test.PrintBean;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationDB.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		DBClass db = ctx.getBean("db", DBClass.class);
		//db("db")라는 bean을 가져와서 db(첫번째db)에 저장
		
		System.out.println("id : "+db.getId());
		System.out.println("pwd : "+db.getPwd());
		
		DBClass db1 = ctx.getBean("db1", DBClass.class);
		System.out.println("id : "+db1.getId());
		System.out.println("pwd : "+db1.getPwd());

	}
}

package com.care.test;

public class OperationClass {
	
	public int operation(int num1, int num2, String op) {
		System.out.println("operation ½ÇÇà");
		int result =0;
		if(op.equals("+")) {
			result = num1+num2;
		}else if(op.equals("-")) {
			result = num1-num2;
		}else if(op.equals("*")) {
			result = num1*num2;
		}else if(op.equals("/")) {
			result = num1/num2;
		}
		return result;
	}
}

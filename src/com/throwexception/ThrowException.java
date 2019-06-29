package com.throwexception;

public class ThrowException {

	public static void main(String[] args) {
		int age = 200;
		try {
			if(age<0 || age>120)
				throw new Exception("年龄数据超出范围"); //显示抛出异常
			System.out.println("age=" + age);
		} catch(Exception e) {
			e.printStackTrace(); //输出调用堆栈跟踪信息
		}

	}

}

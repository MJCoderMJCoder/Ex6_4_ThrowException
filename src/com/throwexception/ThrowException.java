package com.throwexception;

public class ThrowException {

	public static void main(String[] args) {
		int age = 200;
		try {
			if(age<0 || age>120)
				throw new Exception("�������ݳ�����Χ"); //��ʾ�׳��쳣
			System.out.println("age=" + age);
		} catch(Exception e) {
			e.printStackTrace(); //������ö�ջ������Ϣ
		}

	}

}

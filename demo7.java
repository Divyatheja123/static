package com.staticmember;
//static calling from demo7
class demo7 {
	static void m1()
	{
		System.out.println("from static method m1 of demo7");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			m1();
			demo7.m1();
		}

	}

}

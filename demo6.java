package com.staticmember;

class demo6 {
	static int i=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=30;
		System.out.println(i);
		System.out.println(demo6.i);
		demo6.i=40;
		System.out.println(A.i);
		m1();
		System.out.println(A.i);
		System.out.println(demo6.i);
		System.out.println(i);

	}
	public static void m1()
	{
		System.out.println(i);
		i=50;
		A.i=60;
	}

}

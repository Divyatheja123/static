package com.staticmember;

class demo12 {
	static boolean j;
	static
	{
		System.out.println("from sib of demo12");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main of demo12");
		System.out.println(demo11.i);

	}

}

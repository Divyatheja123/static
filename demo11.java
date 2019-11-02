package com.staticmember;

class demo11 {
	static int i;
	static
	{
		System.out.println("from sib of demo 11");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main of demo11 ");
		System.out.println(demo12.j);

	}

}

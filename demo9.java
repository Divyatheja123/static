package com.staticmember;
//static block in diff place
class demo9 {
	
	  static
	  {
		  System.out.println("from sib-1");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");

	}
	static
	{
		System.out.println("from sib-2");
	}

}

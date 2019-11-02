package com.staticmember;
//static one copy executes
class marker {
	static int price;
	static String colour;
	static void writing()
	{
		System.out.println("marker of colour" + marker.colour + "is writing");
	}
	public static void main(String[] args)
	{

		System.out.println(marker.price);
		System.out.println(marker.colour);
		marker.price=100;
		marker.colour="black";
		marker.price=80;
		marker.colour="blue";
		System.out.println("marker colour " +marker.colour + "marker price "+ marker.price);
		System.out.println("marker colour " +marker.colour + "marker price "+ marker.price);
		marker.writing();
	}

}

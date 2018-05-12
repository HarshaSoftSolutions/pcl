package com.exam;

public class Axleta {

	public static int i=m1();
	
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("non static block");
	}
	
  static int m1()
	{
		return 3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Axleta a=new Axleta();
	}

}

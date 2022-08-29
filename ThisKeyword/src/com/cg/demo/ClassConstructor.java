package com.cg.demo;

class Demo
{
	Demo()
	{
		
		System.out.println("Hello");
	}
	Demo(int x)
	{
		this();
		System.out.println(x);
	}
}

public class ClassConstructor {
	public static void main(String args[])
	{
		Demo a =new Demo(10);
	}

}

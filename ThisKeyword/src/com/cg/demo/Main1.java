package com.cg.demo;
//to invoke current class constructor
class Demo1
{
	Demo1()
	{
		this(16);
		System.out.println("welcome");
	}
	Demo1(int x)
	{
		System.out.println(x);
	}
}
public class Main1 {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
	}
	

}

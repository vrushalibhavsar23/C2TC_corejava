package com.cg.demo;

class B
{
	A a1;
	B(A a1)
	{
		this.a1=a1;
	}
	
	void display()
	{
		System.out.println(a1.data);
	}
}
class A
{
	int data=10;
	A()
	{
		B b=new B(this);
		b.display();
	}
	
}

public class ConstructorCall {
	public static void main(String[] args) {
		
		A a=new A();
	
	}

}

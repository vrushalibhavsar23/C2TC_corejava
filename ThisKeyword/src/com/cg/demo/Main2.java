package com.cg.demo;
//argument in the method call

class s2
{
	void m(s2 a)
	{
		System.out.println("This method is invoked");
	}
	void p()
	{
		m(this);
		System.out.println("hi");
		//m(this);
	}
}
public class Main2 {
	public static void main(String[] args) {
		s2 s=new s2();
	    s.p();
	}

}

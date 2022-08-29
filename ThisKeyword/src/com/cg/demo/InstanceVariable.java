package com.cg.demo;
class Student
{
	int rollno;
	String name;
	float fee;
	public Student(int rollno, String name, float fee) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	
}
public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"vrushali",6000f);
		Student s2 = new Student(2,"shivani",7000f);
		
		s1.display();
		s2.display();
	}

}

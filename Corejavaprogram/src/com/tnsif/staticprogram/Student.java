package com.tnsif.staticprogram;

public class Student {
	int rollno;
	String name;
	static String college="Reva";
	
	// static method change value

	static void change() {
		college="vkit";
	
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void displsy() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		Student.change();
		Student s=new Student(1,"Meena N");
		Student s1=new Student(2,"sakshi");
		Student s2=new Student(3,"Priya");
		s1.displsy();
		s2.displsy();
		s.displsy();
	}

}

package com.tnsif.finalkeyworddemo;

public class finalnamedemo {
static int a=8;  // u cant change value
	
	static {
		a=9;
	}
	final void display() { // cant override
		System.out.println("welcome to java");
	}

	

}

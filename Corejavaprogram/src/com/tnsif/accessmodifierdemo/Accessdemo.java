package com.tnsif.accessmodifierdemo;
// demo for access modifier


//public
//private
//protected
//default

public class Accessdemo {
	
	// public 
	 int a=18;
	String s="Meena N";
	
	public void display() {
		System.out.println("welcome to java");
	}
	
	public static void main(String[] args) {
		Accessdemo obj=new Accessdemo();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		obj.display();
	}

}
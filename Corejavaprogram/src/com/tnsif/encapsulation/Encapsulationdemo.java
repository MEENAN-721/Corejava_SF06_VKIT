package com.tnsif.encapsulation;

public class Encapsulationdemo {
	
	int serialnumber;  //data members
	String name;
	int age;
	String college;
	
	void show() {// member function
	System.out.println(serialnumber +" "+name+" "+age+" "+college);	
	}
	
	public static void main(String[] args) {
		Encapsulationdemo d=new Encapsulationdemo();
		d.serialnumber=1;
		d.name="Meena N";
		d.age=21;
		d.college="VKIT";
		d.show();
	}

}
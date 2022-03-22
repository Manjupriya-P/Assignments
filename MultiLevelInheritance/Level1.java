package com.onebill.MultiLevelInheritance;

public class Level1 {
	String type;
	String name;
	public Level1(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public Level1() {
		super();
	}
	public void type(String typ) {
		System.out.println("plant kind  is "+typ);
	}
	public void name(String nam ) {
		System.out.println("plant name  is "+ nam);
	}
	
}



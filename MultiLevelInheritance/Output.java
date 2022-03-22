package com.onebill.MultiLevelInheritance;

public class Output {
	public static void main(String[] args) {
		Level2 obj1=new Level2();
		obj1.type("herb");
		obj1.name("thulasi");
		obj1.location("corridor");
		obj1.count(2);
		
		System.out.println("==========================\r");
		Level3 obj2=new Level3();
		obj2.type("tree");
		obj2.name("mango tree");
		obj2.location("front");
		obj2.count(2);
		obj2.flowers(5);

	}
}

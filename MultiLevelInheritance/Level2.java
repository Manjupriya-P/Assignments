package com.onebill.MultiLevelInheritance;

public class Level2 extends Level1 {
	String location;
	int count;
	public Level2(String location, int count) {
		super();
		this.location = location;
		this.count = count;
	}
	public Level2() {
		super();
	}
	public void location(String loc) {
		System.out.println("the location of plant is "+ loc);
	}
	public void count(int ct) {
		System.out.println("the count of the plant is:" + ct);
	}

}

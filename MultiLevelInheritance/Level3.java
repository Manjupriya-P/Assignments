package com.onebill.MultiLevelInheritance;

public class Level3 extends Level2{
	int flowers;

	public Level3(int flowers) {
		super();
		this.flowers = flowers;
	}

	public Level3() {
		super();
	}
	

	public void flowers(int flo){
		System.out.println("the no of flowers in the plant is: "+flo);
		
	}


}

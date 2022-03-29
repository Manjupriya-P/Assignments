package com.onebill.finalpack;

public class Finalvar {
	final int x=12;
	public static void main(String[] args) {
		Finalvar obj = new Finalvar();
		System.out.println(obj.x);
		Finalvar obj2 = new Finalvar();//final variable cant be reinitialized
		//obj2.x=13;
		//System.out.println(obj2.x);
	}

}

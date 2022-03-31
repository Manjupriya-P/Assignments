package com.mischallaneous.Mischallaneous;

public class MRefernce2 {
	

	public void method(int x,int y) {
		System.out.println("from method 1 ");
		int z= x-y;
		System.out.println(z);
	}
	

	public static void main(String[] args) {
		//MRefernce2 obj = new MRefernce2;
		Mreference1 t= new MRefernce2()::method;
		t.sub(20,10);


	}

}

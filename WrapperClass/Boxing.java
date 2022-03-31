package com.onebill.WrapperClass;

import java.util.ArrayList;

public class Boxing {

	public static void main(String[] args) {
		int a=5;
		char b='g';
		//String s="hi";
		
		ArrayList<Integer> obj =new ArrayList<Integer>();
		obj.add(a);
		obj.add((int) b);
	//	obj.addAll(s);
		System.out.println("autoboxing");
		System.out.println(obj.get(0));
		System.out.println(obj);
		
		System.out.println(obj.get(1));
		//System.out.println(obj.get(2));
		int num= obj.get(0);
		System.out.println(num);
		

	}

}

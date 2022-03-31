package com.onebill.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet11 {

	public static void main(String[] args) {
		TreeSet<Integer> obj=new TreeSet<>();
		obj.add(19);
		obj.add(24);
		obj.add(34);
		obj.add(55);
		System.out.println("tree set");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		Collections.sort(arrayList);
		
		Iterator<Integer> iobj1 = obj.iterator();
		Collections.sort(arrayList);
		while(iobj1.hasNext()) {
			System.out.println(iobj1.next());
		}

	}

}

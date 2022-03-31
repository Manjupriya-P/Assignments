package com.onebill.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashsett {

	public static void main(String[] args) {
		TreeSet<Integer> obj=new TreeSet<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(5);
		System.out.println("tree set");
		Iterator<Integer> iobj1 = obj.iterator();
		while(iobj1.hasNext()) {
			System.out.println(iobj1.next());
		}
		
		
		
		
		
		LinkedHashSet<Integer> obj2 = new LinkedHashSet<>();
		obj2.add(12);
		obj2.add(13);//linked has set dont allow duplicate
		obj2.add(13);//follows insertion order
		obj2.add(14);
		Iterator<Integer> iobj = obj2.iterator();
		System.out.println("linked has set");
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
			
		}

	}

}

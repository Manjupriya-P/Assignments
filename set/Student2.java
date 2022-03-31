package com.onebill.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.onebill.set1.Student;

public class Student2 {

	public static void main(String[] args) {

		Student1 obj = new Student1("manju", 01, "ece");
		Student1 obj1 = new Student1("priya", 02, "eee");
		Student1 obj2 = new Student1("jayashree", 03, "cse");
		Student1 obj3 = new Student1("neha", 04, "it");
		Student1 obj4 = new Student1("jensha", 05, "i&e");
		Student1 obj5 = new Student1("neha", 04, "it");
		HashSet<Student1> hash = new HashSet<>();
		hash.add(obj);
		hash.add(obj1);
		hash.add(obj3);
		hash.add(obj4);
		hash.add(obj5);
		//System.out.println(hash);
//		Iterator<Student1> iobj = hash.iterator();
//		for (Student1 ob : hash) {
//			System.out.println(ob);
//		}
		ArrayList<Student1> arrayList = new ArrayList<>(hash);
		SortByID sortByID = new SortByID();
		 SortByName sortByName = new SortByName();
		Collections.sort(arrayList, sortByName);
		Iterator<Student1> iobj = hash.iterator();
		for (Student1 ob : hash) {
			System.out.println(ob);
		}

		
		

	}

}

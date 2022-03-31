package com.onebill.linkedSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Company1 {
	public static void main(String[] args) {
		Company obj1 = new Company(01, 100, "trainee");
		Company obj2 = new Company(02, 50, "supervisor");
		Company obj3 = new Company(03, 12, "manager");
		LinkedHashSet<Company> obj = new LinkedHashSet<>();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		ArrayList<Company> arrayList = new ArrayList<>(obj);
		SortById sortById = new SortById();
		SortByCount sortByCount = new SortByCount();
		SortByDesignation sortByDesignation = new SortByDesignation();
		Collections.sort(arrayList, sortByDesignation);
		Iterator<Company> iterator = arrayList.iterator();
		for (Company name : arrayList) {
			System.out.println(name);
		}

	}

}

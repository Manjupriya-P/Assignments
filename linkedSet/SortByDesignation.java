package com.onebill.linkedSet;

import java.util.Comparator;

public class SortByDesignation implements Comparator<Company>{

	
	

	@Override
	public int compare(Company o1, Company o2) {
		// TODO Auto-generated method stub
		return o1.designation.compareTo(o2.designation);
	}

}


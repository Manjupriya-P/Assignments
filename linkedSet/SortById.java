package com.onebill.linkedSet;

import java.util.Comparator;

public class SortById implements Comparator<Company> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Company o1, Company o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

}

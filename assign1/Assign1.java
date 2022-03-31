package com.onebill.assign1;

import java.util.Scanner;

public class Assign1 {
	static int a[];
	static int x = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size = sc.nextInt();
		a = new int[size];
		System.out.println("enter the elements of array: ");

		for (int i = 0; i < size; i++) {
			int y = sc.nextInt();
			a[i] = y;
		}
		for (int i = 0; i < size; i++) {

			x = x + a[i];

		}
		System.out.println(x);
	

	}

}

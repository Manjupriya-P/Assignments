package com.onebill.Arrays;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int a[];
		int siz;
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size  of the array: ");
		siz = s.nextInt();
		a = new int[siz];
		// a.length=siz;
		System.out.println("enter the elements of the array: ");
		for (int i = 0; i < siz; i++) {
			int x = s.nextInt();
			a[i] = x;
		}
		for (int i = 0; i < siz; i++) {
			for (int j = i + 1; j < siz; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("sorted array is: ");

		for (int i = 0; i < siz; i++) {
			System.out.println(a[i]);
		}

	}

}

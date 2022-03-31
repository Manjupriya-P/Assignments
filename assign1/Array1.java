package com.onebill.assign1;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {

		int a[];
		int b[] = new int[2];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int size = sc.nextInt();
		a = new int[size];
		System.out.println("enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		if (size > 2) {
			for (int i = 0; i < 2; i++) {
				// b[i] = sc.nextInt();
				b[i] = a[i];
			}
			System.out.println(Arrays.toString(b));
		} else {
			System.out.println("==========");
		}
	}
}

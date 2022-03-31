package com.onebill.assign1;

import java.util.Scanner;

public class Array3 {
	static int a[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0;

		System.out.println("enter the size of the array: ");
		int size = sc.nextInt();
		a = new int[size];
		int i;
		System.out.println("enter the elements of array: ");
		for (i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < size - 1; i++) {
			if (a[i] == 3) {

				x = 1;
				System.out.println(x);
				if (a[i + 1] == 3) {
					x = 2;

					System.out.println(x);
					if (a[i + 2] == 3) {

//					System.out.println(a[i]);
//					System.out.println(a[i + 1]);
//					System.out.println(a[i + 2]);
						x = 3;
					}
				}
			}
		}
		if (x == 1) {
			System.out.println("only one 3 is present");
			if (x == 2) {
				System.out.println("only 2 three is present");
				if (x == 3) {
					System.out.println("only 3 three is present");
				} else {
					System.out.println("no consecutive 3 is present");
				}
			}

		}
	}
}

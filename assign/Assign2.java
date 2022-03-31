package com.variable.assign;

import java.util.Arrays;
import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		try (Scanner ip= new Scanner(System.in)){
		int a,b,limit;
		System.out.println("Enter the value of a:");
		a=ip.nextInt();
		System.out.println("Enter the value of b:");
		b=ip.nextInt();
		System.out.println("Enter the value of limit:");
		limit=ip.nextInt();
		int[] result=new int[limit];
		
		for(int i=0;i<limit;i++) {
			if(i==0) {
				result[i]=(int)(a+Math.pow(2,i)*b);
			}
			else
				result[i]=result[i-1]+(int)(Math.pow(2,i))*b;
		}
		
		System.out.println("The output is:");
		System.out.println(Arrays.toString(result));
		
		
		// TODO Auto-generated method stub
		}
	}

}

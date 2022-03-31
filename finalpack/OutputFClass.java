package com.onebill.finalpack;

public class OutputFClass {//extends Finalclass {//remove the comment and see the error
	int a=13;
	int b =12;
//final class cant be inherited
		

		public OutputFClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}



		public int add(int a, int b) {
			return a*b;
			
			
		}
		public static void main(String[] args) {
			
		}
		OutputFClass obj=new OutputFClass(1,2);
	//System.out.println(obj.add);
		
		// TODO Auto-generated method stub

	}


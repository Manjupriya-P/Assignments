package com.mischallaneous.Mischallaneous;

public class StaticNonStatic {
	

		static int x=10;
		int y;
		public StaticNonStatic(int y) {
			
			this.y = y;
			System.out.println("this is a constructor "+y);
		}
		static {
			System.out.println("this is a static block");
//executed only once since the class loads only once in the class loader
			System.out.println(x);
			//System.out.println(y);
//static cant access instance variable becaz to access ins var 
//we need to have an object but static block executes before the instance block
			}
		{
			System.out.println("this is a non static block");
			System.out.println(x);
			System.out.println("no value initialized so null value  "+y);//prints null
			//System.out.println(n.y);
//instance variable cant be called if we create an object because 
//non static loads before object(we need constructor to  call obj which loads 
// next to the constructor
		}
		public static void main(String[] args) {
			StaticNonStatic n = new StaticNonStatic(23);
			System.out.println(StaticNonStatic.x);
			System.out.println(n.y);
		}
		
		

	}



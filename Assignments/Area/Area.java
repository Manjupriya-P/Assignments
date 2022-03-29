package com.Assignments.Area;

public class Area extends Shapes {

	@Override
	public int RectangleArea(int l, int b) {
		
		return l*b;
	}

	@Override
	public int SquareArea(int s) {

		return s*s;
	}

	@Override
	public float CircleArea(float r) {
		// TODO Auto-generated method stub
		return (3.14f*r*r);
	}

}

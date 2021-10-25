package com.sist.exam03;

public abstract class twoDimShpae extends Shape {
	protected double area;

	public twoDimShpae(int x, int y) {
		super(x, y);
	}

	public twoDimShpae() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstract double getArea();

}

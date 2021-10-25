package com.sist.exam03;

public abstract class ThreeDimShpae extends Shape {
	protected double volume;
	
	public ThreeDimShpae(int x, int y) {
		super(x, y);
	}
	
	public ThreeDimShpae() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract double getVolume();

}

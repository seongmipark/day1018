package com.sist.exam03;

public class Shpere extends ThreeDimShpae {
	private double radius;

	public Shpere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shpere(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}	
	
	@Override
	public double getVolume() {
		volume = 4.0/3*Math.PI*Math.pow(radius, 3);
		return volume;
	}

	@Override
	public String toString() {
		return "Shpere [radius=" + radius + ", volume=" + volume + ", x=" + x + ", y=" + y + "]";
	}

}

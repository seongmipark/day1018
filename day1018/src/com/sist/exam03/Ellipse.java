package com.sist.exam03;

public class Ellipse extends twoDimShpae {
	
	private double width_radius;
	private double hieght_radius;
	
	public double getWidth_radius() {
		return width_radius;
	}

	public void setWidth_radius(double width_radius) {
		this.width_radius = width_radius;
	}

	public double getHieght_radius() {
		return hieght_radius;
	}

	public void setHieght_radius(double hieght_radius) {
		this.hieght_radius = hieght_radius;
	}

	public Ellipse(int x, int y, double width_radius, double hieght_radius) {
		super(x, y); 
		this.width_radius = width_radius;
		this.hieght_radius = hieght_radius;
	}


	@Override
	public String toString() {
		return "Ellipse [width_radius=" + width_radius + ", hieght_radius=" + hieght_radius + ", area=" + area + ", x="
				+ x + ", y=" + y + "]";
	}

	@Override
	public double getArea() {
		area = Math.PI* width_radius*hieght_radius;
		return area;
	}

}

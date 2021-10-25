package com.sist.exam13;

class Car implements Movable{
	private String name;
	private String color;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	//인터페이스 메소드 필요
	@Override
	public void speedUp(int amount) {
		// TODO Auto-generated method stub
		
		System.out.println("속도를"+amount+" 높입니다.");	
	}

	@Override
	public void speedDown(int amount) {
		// TODO Auto-generated method stub
		System.out.println("속도를"+amount+" 낮춥니다.");
	}
	
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("좌회전합니다.");
		
	}
	
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("우회전합니다.");		
	}
	
	public static void printSpeed() {
		System.out.println("현재 속도:"+speed);
	}
		
}
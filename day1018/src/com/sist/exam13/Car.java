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

	//�������̽� �޼ҵ� �ʿ�
	@Override
	public void speedUp(int amount) {
		// TODO Auto-generated method stub
		
		System.out.println("�ӵ���"+amount+" ���Դϴ�.");	
	}

	@Override
	public void speedDown(int amount) {
		// TODO Auto-generated method stub
		System.out.println("�ӵ���"+amount+" ����ϴ�.");
	}
	
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("��ȸ���մϴ�.");
		
	}
	
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("��ȸ���մϴ�.");		
	}
	
	public static void printSpeed() {
		System.out.println("���� �ӵ�:"+speed);
	}
		
}
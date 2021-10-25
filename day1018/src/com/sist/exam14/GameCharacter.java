package com.sist.exam14;

public abstract class GameCharacter {
	public abstract void draw();
	//자식클래스들이 반드시 오버라이딩 해야한다
	
	public void getLife() {
		System.out.println("GameCharacter()dml getLife()");
	}
}

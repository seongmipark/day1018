package com.sist.exam13;

interface Movable {
		public void speedUp(int amount);
		public void speedDown(int amount);
		//abstract 생략 O
		
		//int speed;
		//초기화가안되서오류

		final int speed = 100;
		
		/*public void printSpeed() {
			System.out.println("현재 속도:"+speed);
		}*/
		//인터페이스에는 body가 구체화된 메소드를 포함 할 수 없다
	}

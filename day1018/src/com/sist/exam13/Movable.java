package com.sist.exam13;

interface Movable {
		public void speedUp(int amount);
		public void speedDown(int amount);
		//abstract ���� O
		
		//int speed;
		//�ʱ�ȭ���ȵǼ�����

		final int speed = 100;
		
		/*public void printSpeed() {
			System.out.println("���� �ӵ�:"+speed);
		}*/
		//�������̽����� body�� ��üȭ�� �޼ҵ带 ���� �� �� ����
	}

package com.sist.exam14;

public class Test {
	
	/*public static void drawAll(GameCharacter []array) {
		for(GameCharacter character :array) {
			character.draw();
			((Hobitt)character).getRing();
		}
	}
	�����߻� = > �迭�ȿ��� ȣ��,Ÿ��ź,�ּ��簡 �ִµ�
	������� ȣ������ ����ȯ�߱� ������ �����߻�
	ȣ������ ����� ����ȯ �ؾ��Ѵ�.	
	*/
	
	public static void drawAll(GameCharacter []array) {
		for(GameCharacter character :array) {
			character.draw();
			if(character instanceof Hobitt) {
			((Hobitt)character).getRing();
		}
	}
	}
	
	/*public static void drawAll(Object []array) {	
		for(Object character :array) {
			//character.draw();
			((GameCharacter)character).draw();
		}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		GameCharacter g1 = new Hobitt();
 * 		//is a ���迡 ���� �� �θ��� ���������� �ڽ�Ŭ���� ��ü�� ������ �� �ִ�.
		GameCharacter g2 = new TItan();
		GameCharacter g3 = new Sorcerer();
	
		//g1.getLife();
		//��ü�� �޼����� ������ �ڽ��� Ŭ�������� ���� ã�� ������ �θ��� �޼ҵ尡 ����
		
		//g1.getRing(); 
		//is a ���迡 ���� �� �θ��� ���������� �ڽ�Ŭ������ ��ü�� �����Ҽ� ������
		//�ڽ�Ŭ�������� �߰��� �޼ҵ�� �ٷ� ȣ���� �� ����.
		
		((Hobitt)g1).getRing(); //��� : GameCharacter()�� getRing()
		//is a ���迡 ���� �� �θ��� ���������� �ڽ�Ŭ������ü�� �����Ҷ�
		//�ڽ�Ŭ�������� �߰��� �޼ҵ�� �ڽ�Ŭ������ ����ȯ �� �� ȣ���ؾ��Ѵ�.
		
		*/
		
		//�迭�� Ÿ���� GameCharacter
		/*GameCharacter [] array = new GameCharacter[6];
		array[0] = new Hobitt();
		array[1] = new Hobitt();
		array[2] = new Sorcerer();
		array[3] = new Titan();
		array[4] = new Titan();
		array[5] = new Sorcerer();*/
		
		//�迭�� �����ϸ鼭 �ٷ� �ʱ�ȭ �غ���
		GameCharacter [] array = {
				new Hobitt(),
				new Hobitt(),
				new Titan(),
				new Titan(),
				new Sorcerer(),
				new Sorcerer(),
		};
		
		for(GameCharacter character : array) {
			character.draw();
		}
		
		drawAll(array);
	}
	
}


package com.sist.exam14;

public class Test {
	
	/*public static void drawAll(GameCharacter []array) {
		for(GameCharacter character :array) {
			character.draw();
			((Hobitt)character).getRing();
		}
	}
	오류발생 = > 배열안에는 호빗,타이탄,주술사가 있는데
	덮어놓고 호빗으로 형변환했기 때문에 오류발생
	호빗인지 물어보고 형변환 해야한다.	
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
 * 		//is a 관계에 있을 때 부모의 참조변수가 자식클래스 객체를 참조할 수 있다.
		GameCharacter g2 = new TItan();
		GameCharacter g3 = new Sorcerer();
	
		//g1.getLife();
		//객체가 메세지를 받으면 자신의 클래스에서 먼저 찾고 없으면 부모의 메소드가 동작
		
		//g1.getRing(); 
		//is a 관계에 있을 때 부모의 참조변수가 자식클래스의 객체에 참조할수 있지만
		//자식클래스에서 추가한 메소드는 바로 호출할 수 없다.
		
		((Hobitt)g1).getRing(); //결과 : GameCharacter()의 getRing()
		//is a 관계에 있을 때 부모의 참조변수가 자식클래스객체를 참조할때
		//자식클래스에서 추가된 메소드는 자식클래스로 형변환 한 후 호출해야한다.
		
		*/
		
		//배열의 타입은 GameCharacter
		/*GameCharacter [] array = new GameCharacter[6];
		array[0] = new Hobitt();
		array[1] = new Hobitt();
		array[2] = new Sorcerer();
		array[3] = new Titan();
		array[4] = new Titan();
		array[5] = new Sorcerer();*/
		
		//배열을 생성하면서 바로 초기화 해보기
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


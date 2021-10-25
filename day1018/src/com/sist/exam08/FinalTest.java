package com.sist.exam08;

class Person{
	public String name = "홍길동";
	public static final String addr = "서울시 마포구 서교동";
	//바꾸지 못하는 final은 굳이 객체마다 따로 메모리를 확보할 필요없다.
	//그래서 final멤버는 static으로 만드는 것이 좋다.
	
	// final은 static으로 만든다. O
	// static은 final로 만든다? X static은 공동으로 사용하고 값을 변경할수 있기 때문이다
	
}

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person father = new Person();
		Person son = new Person();
		
		father.name = "홍길동";
		son.name = "홍두식";
		
		System.out.println(father.name + "," + father.addr);
		System.out.println(son.name + "," + son.addr);
		
		//father.addr = "제주도 서귀포시 애월읍";
		//final변수이기때문에 값을 바꿀 수 없다.
	}
}

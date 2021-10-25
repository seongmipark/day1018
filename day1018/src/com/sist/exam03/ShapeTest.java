package com.sist.exam03;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타원,사각형,삼각형,구,직육면체,원기둥
		
		//3개의 도형
		//타원,직육면체,원기둥
		//타원도 담고 직육면체도 담고 원기둥도 담을 수 있는 자료형 => Shape
		Shape [] arr = new Shape[3];
		
		arr[0] = new Ellipse(10, 10, 20, 50);
		arr[1] = new Cube(10, 100, 100, 100, 100);
		arr[2] = new Cylinder(10, 300, 50, 100);
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		((twoDimShpae)arr[0]).getArea(); 
		((ThreeDimShpae)arr[1]).getVolume();
		((ThreeDimShpae)arr[2]).getVolume();
		
		System.out.println("--------------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		
		//위 명령어를 일괄처리해보기
		for( Shape s  : arr ) {
			if(s instanceof twoDimShpae) {
				((twoDimShpae) s).getArea();
			}else if(s instanceof ThreeDimShpae) {
				((ThreeDimShpae) s).getVolume();
			}
			System.out.println(s);
		}
	
	}

}

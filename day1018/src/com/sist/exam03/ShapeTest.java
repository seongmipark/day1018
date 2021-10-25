package com.sist.exam03;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ÿ��,�簢��,�ﰢ��,��,������ü,�����
		
		//3���� ����
		//Ÿ��,������ü,�����
		//Ÿ���� ��� ������ü�� ��� ����յ� ���� �� �ִ� �ڷ��� => Shape
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
		
		
		//�� ��ɾ �ϰ�ó���غ���
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

package com.sist.exam05;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book []arr = new Book[3];
		arr[0] = new Novel("N1234", "����ִ� �ڹ�", "����ȣ");
		arr[1] = new Novel("N1234", "����ִ� �ڹ�", "����ȣ");
		
		if(arr[0].equals(arr[1])) {
			System.out.println("������ �����Դϴ�.");
		}else {
			System.out.println("������ ������ �ƴմϴ�.");
		}
		
		arr[1] = new Poet("P1234", "�ڹٿ� �Բ�", "������");
		if(arr[0].equals(arr[1])) {
			System.out.println("������ �����Դϴ�.");
		}else {
			System.out.println("������ ������ �ƴմϴ�.");
		}	
		
		arr[2] = new ScienceFiction("S1234", "�ź��� �ڹ�", "�����");
		
		for(Book book : arr) {
			System.out.println(book);
			System.out.println("��ü��"+book.getLateFees(2));
			System.out.println("=========================");
		}
	}

}
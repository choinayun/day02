package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		final String KOREA = "���ѹα�";
		System.out.println( KOREA );
		
//		KOREA = "ĳ����";
//		System.out.println( KOREA );
		
		// �Է� �ޱ� 
		Scanner input = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = input.next();
		int age;
		System.out.println("���� �Է� : ");
		age = input.nextInt();
		
		System.out.println(name + "���� ���̴� " + age);
	}
	
}

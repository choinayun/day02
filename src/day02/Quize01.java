package day02;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("����� �̸��� �����Դϱ�?");
		String name = input.next();
		
		int k;
		System.out.println(name + "���� ���� ���� : ");
		k = input.nextInt();
		
		int e;
		System.out.println(name + "���� ���� ���� : ");
		e = input.nextInt();
				
		int m;
		System.out.println(name + "���� ���� ���� : ");
		m = input.nextInt();
		
		System.out.println("================");
		System.out.println("�� �� : " + name);
		System.out.println("================");
		System.out.println("�� �� : " + k);
		System.out.println("�� �� : " + e);
		System.out.println("�� �� : " + m);
		System.out.println("================");
		System.out.println("�� �� : " + (k+e+m));
		System.out.println("================");
	}
}

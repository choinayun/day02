package day02;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		
		// ���̸� �Է� �޾Ƽ� ���� ��� �ȳ����ֱ� 
		// 0 ~ 7�� : 700��
		// 8 ~ 19�� : 1100��
		// 20�� �̻� : 1350�� 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���");
		
		int a;
		a = input.nextInt();
		
		if (a >= 20) {
			System.out.println("��������� 1350�� �Դϴ�.");
		}
		
		if (a >= 8 && a <= 19) {
			System.out.println("��������� 1100�� �Դϴ�.");
		}
		
		if (a >= 0 && a <= 7) {
			System.out.println("��������� 700�� �Դϴ�.");
		}

		
	}
}

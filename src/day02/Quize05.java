package day02;

import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �ð��� �Է��ϼ���");
		
		int time = input.nextInt();
		int pay = 9160;
		
		if(time > 8) {
			System.out.println("�Ϸ� �ϴ��� " + ((pay*8) + ((time-8)*13740)) + "�� �Դϴ�.");
		}
		
		if(time < 8) {
			System.out.println("�Ϸ� �ϴ��� " + (pay*time) + "�� �Դϴ�.");
		}
		
	}
	
}


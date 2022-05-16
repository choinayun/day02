package day02;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		
		// 나이를 입력 받아서 버스 요금 안내해주기 
		// 0 ~ 7살 : 700원
		// 8 ~ 19살 : 1100원
		// 20살 이상 : 1350원 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		
		int a;
		a = input.nextInt();
		
		if (a >= 20) {
			System.out.println("버스요금은 1350원 입니다.");
		}
		
		if (a >= 8 && a <= 19) {
			System.out.println("버스요금은 1100원 입니다.");
		}
		
		if (a >= 0 && a <= 7) {
			System.out.println("버스요금은 700원 입니다.");
		}

		
	}
}

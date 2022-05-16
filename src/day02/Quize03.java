package day02;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		
		int a, b;
		a = input.nextInt();
		b = input.nextInt();
		
		if(a > b) {
			System.out.println("a > b");
		}
		
		if(a < b) {
			System.out.println("a < b");
		}
		
		if(a == b) {
			System.out.println("a == b");
		}
		
	}
}

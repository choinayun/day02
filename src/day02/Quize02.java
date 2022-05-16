package day02;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("숫자를 입력하시오");
		
		int a;
		a = input.nextInt();
		
		String s = (a%2==0)?"짝수":"홀수";
		System.out.println(a + "=" + s);
		
		s = (a%3==0)?"3의 배수다":"3의 배수가 아니다";
		System.out.println(a + "=" + s);
		
		int su1, su2;
		System.out.println("두 숫자를 입력하시오");
		su1 = input.nextInt();
		su2 = input.nextInt();
		
		s = (su1 > su2)?"su1이 더 크다":"su2가 더 크다";
		System.out.println("su1 : " + su1 + " , " + "su2 : " + su2 + "\n" + s);
	
		
		
	}
}

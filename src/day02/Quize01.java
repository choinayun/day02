package day02;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String name = input.next();
		
		int k;
		System.out.println(name + "님의 국어 점수 : ");
		k = input.nextInt();
		
		int e;
		System.out.println(name + "님의 영어 점수 : ");
		e = input.nextInt();
				
		int m;
		System.out.println(name + "님의 수학 점수 : ");
		m = input.nextInt();
		
		System.out.println("================");
		System.out.println("이 름 : " + name);
		System.out.println("================");
		System.out.println("국 어 : " + k);
		System.out.println("영 어 : " + e);
		System.out.println("수 학 : " + m);
		System.out.println("================");
		System.out.println("합 계 : " + (k+e+m));
		System.out.println("================");
	}
}

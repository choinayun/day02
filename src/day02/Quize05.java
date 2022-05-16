package day02;

import java.util.Scanner;

public class Quize05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("일한 시간을 입력하세요");
		
		int time = input.nextInt();
		int pay = 9160;
		
		if(time > 8) {
			System.out.println("하루 일당은 " + ((pay*8) + ((time-8)*13740)) + "원 입니다.");
		}
		
		if(time < 8) {
			System.out.println("하루 일당은 " + (pay*time) + "원 입니다.");
		}
		
	}
	
}


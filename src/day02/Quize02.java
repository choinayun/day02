package day02;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("���ڸ� �Է��Ͻÿ�");
		
		int a;
		a = input.nextInt();
		
		String s = (a%2==0)?"¦��":"Ȧ��";
		System.out.println(a + "=" + s);
		
		s = (a%3==0)?"3�� �����":"3�� ����� �ƴϴ�";
		System.out.println(a + "=" + s);
		
		int su1, su2;
		System.out.println("�� ���ڸ� �Է��Ͻÿ�");
		su1 = input.nextInt();
		su2 = input.nextInt();
		
		s = (su1 > su2)?"su1�� �� ũ��":"su2�� �� ũ��";
		System.out.println("su1 : " + su1 + " , " + "su2 : " + su2 + "\n" + s);
	
		
		
	}
}

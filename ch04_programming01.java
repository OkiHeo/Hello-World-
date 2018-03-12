package ch04;

import java.util.Scanner;

public class programming01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mile;
		double kilo;
		System.out.print("마일을 입력하시오: ");
		mile = input.nextInt();
		kilo = mile*1.609;
		
		System.out.println(mile+"마일은 "+kilo+"킬로미터입니다.");
	}

}

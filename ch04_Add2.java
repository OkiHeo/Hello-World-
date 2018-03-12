package ch04;

import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		
		System.out.print("첫 번쨰 숫자 : ");
		x = input.nextInt();
		System.out.print("두 번쨰 숫자 : ");
		y = input.nextInt();
		
		sum = x+y;
		System.out.println("합은"+sum+"입니다.");

	}

}

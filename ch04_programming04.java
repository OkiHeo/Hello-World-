package ch04;

import java.util.Scanner;

public class programming04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double f;
		double c;
		
		System.out.print("화씨 온도를 입력하세요: ");
		f = input.nextDouble();
		
		c = 5*(f-32)/9;
		System.out.println("\n섭씨 온도는 "+c+"입니다.");

	}

}

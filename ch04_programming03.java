package ch04;

import java.util.Scanner;

public class programming03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		double volume;
		System.out.print("반지름을 입력하세요: ");
		radius = input.nextDouble();
		volume = 4*radius*radius*radius/3;
		System.out.print("\n부피는 "+volume+"입니다.");
		
	}

}

package ch04;

import java.util.Scanner;

public class programming03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		double volume;
		System.out.print("�������� �Է��ϼ���: ");
		radius = input.nextDouble();
		volume = 4*radius*radius*radius/3;
		System.out.print("\n���Ǵ� "+volume+"�Դϴ�.");
		
	}

}

package ch04;

import java.util.Scanner;

public class programming04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double f;
		double c;
		
		System.out.print("ȭ�� �µ��� �Է��ϼ���: ");
		f = input.nextDouble();
		
		c = 5*(f-32)/9;
		System.out.println("\n���� �µ��� "+c+"�Դϴ�.");

	}

}

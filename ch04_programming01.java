package ch04;

import java.util.Scanner;

public class programming01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mile;
		double kilo;
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = input.nextInt();
		kilo = mile*1.609;
		
		System.out.println(mile+"������ "+kilo+"ų�ι����Դϴ�.");
	}

}

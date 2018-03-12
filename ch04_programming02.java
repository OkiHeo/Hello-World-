package ch04;

import java.util.Scanner;

public class programming02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int money, sum, change;
		double tax;
		System.out.print("¹ÞÀº µ·: ");
		money = input.nextInt();
		System.out.print("»óÇ°ÀÇ ÃÑ¾×: ");
		sum = input.nextInt();
		tax = sum*0.1;
		change = money-sum;
		System.out.print("ºÎ°¡¼¼ : "+(int)tax+"\n");
		System.out.print("ÀÜµ·: "+change);

	}

}

package ch04;

import java.util.Scanner;

public class programming02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int money, sum, change;
		double tax;
		System.out.print("���� ��: ");
		money = input.nextInt();
		System.out.print("��ǰ�� �Ѿ�: ");
		sum = input.nextInt();
		tax = sum*0.1;
		change = money-sum;
		System.out.print("�ΰ��� : "+(int)tax+"\n");
		System.out.print("�ܵ�: "+change);

	}

}

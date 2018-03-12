package ch04;

import java.util.Scanner;

public class lab01 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		double w, h;
		double area;
		double perimeter;
		
		w=input.nextDouble();
		h=input.nextDouble();
		area = w*h;
		perimeter=2*(w+h);
		
		System.out.println("사각형의 넓이: "+area);
		System.out.println("사각형의 둘레: "+perimeter);
		
	}
}

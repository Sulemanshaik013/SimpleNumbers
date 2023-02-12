package com.operations;
import java.util.Scanner;

public class PerfectSquareOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		perfectSquare(number);

		sc.close();
	}

	private static void perfectSquare(int number) {
		int squareRootofNumber=(int) Math.sqrt(number);
		if((squareRootofNumber*squareRootofNumber)==number) {
			System.out.println(number+" is a perfect Square");
		}
		else {
			System.out.println(number+ " is not a perfect square");
		}
	}
}

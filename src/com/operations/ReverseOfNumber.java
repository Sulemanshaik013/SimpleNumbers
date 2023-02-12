package com.operations;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		int rev = reverseOfNumber(number);

		System.out.println("Reverse of number " + number + " is " + rev);
		sc.close();
	}

	private static int reverseOfNumber(int number) {
		int rev = 0;
		while (number != 0) {
			int res = number % 10;
			rev = rev * 10 + res;
			number = number / 10;
		}
		return rev;
	}
}

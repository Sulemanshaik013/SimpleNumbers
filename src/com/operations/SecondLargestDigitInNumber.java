package com.operations;

import java.util.Scanner;

public class SecondLargestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		int secondLargestDigit = secondLargestDigit(number);

		System.out.println("Second Largest digit in number " + number + " is " + secondLargestDigit);
		sc.close();
	}

	private static int secondLargestDigit(int number) {
		int large = 0, secondLarge = 0;
		while (number != 0) {
			int res = number % 10;
			if (res > large) {
				secondLarge = large;
				large = res;
			} else if (secondLarge <= res) {
				secondLarge = res;
			}
			number = number / 10;
		}
		return secondLarge;
	}
}

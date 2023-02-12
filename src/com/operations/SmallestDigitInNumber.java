package com.operations;

import java.util.Scanner;

public class SmallestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		int smallestDigit = smallestDigit(number);

		System.out.println("Smallest digit in number " + number + " is " + smallestDigit);
		sc.close();
	}

	private static int smallestDigit(int number) {
		int small = 9;
		while (number != 0) {
			int res = number % 10;
			if (res < small) {
				small = res;
			}
			number = number / 10;
		}
		return small;
	}
}

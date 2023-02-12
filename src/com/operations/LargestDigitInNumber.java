package com.operations;
import java.util.Scanner;

public class LargestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		int largestDigit = largestDigit(number);

		System.out.println("Largest digit in number " + number + " is " + largestDigit);
		sc.close();
	}

	private static int largestDigit(int number) {
		int large = 0;
		while (number != 0) {
			int res = number % 10;
			if (res > large) {
				large = res;
			}
			number = number / 10;
		}
		return large;
	}
}

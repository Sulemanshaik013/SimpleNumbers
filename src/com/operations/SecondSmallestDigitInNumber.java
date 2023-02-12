package com.operations;
import java.util.Scanner;

public class SecondSmallestDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		int secondSmallestDigit = secondSmallestDigit(number);

		System.out.println("Second Smallest digit in number " + number + " is " + secondSmallestDigit);
		sc.close();
	}

	private static int secondSmallestDigit(int number) {
		int small = 9, secondSmall = 9;
		while (number != 0) {
			int res = number % 10;
			if (res < small) {
				secondSmall = small;
				small = res;
			} else if (secondSmall >= res) {
				secondSmall = res;
			}
			number = number / 10;
		}
		return secondSmall;
	}
}

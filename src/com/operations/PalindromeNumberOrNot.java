package com.operations;

import java.util.Scanner;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		isPalindrome(number);

		sc.close();
	}

	private static void isPalindrome(int number) {
		int rev = 0, temp = number;
		while (number != 0) {
			int res = number % 10;
			rev = rev * 10 + res;
			number = number / 10;
		}
		if (rev == temp) {
			System.out.println(temp + " is a palindrome number");
		} else {
			System.out.println(temp + " is not a pallindrome number");
		}
	}
}

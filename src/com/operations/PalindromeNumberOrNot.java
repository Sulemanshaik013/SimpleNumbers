package com.operations;
import java.util.Scanner;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		palindrome(number);

		sc.close();
	}

	private static void palindrome(int number) {
		int rev = 0,temp=number;
		while (number != 0) {
			int res = number % 10;
			rev = rev * 10 + res;
			number = number / 10;
		}
		if(rev==temp) {
			System.out.println(number +" is a palindrome number");
		}else {
			System.out.println(number +" is not a pallindrome number");
		}
	}
}

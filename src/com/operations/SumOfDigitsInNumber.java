package com.operations;
import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		int sum = sumOfDigits(number);

		System.out.println("Sum of digits in number " + number + " is " + sum);
		sc.close();
	}

	private static int sumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			int res = number % 10;
			sum = sum + res;
			number = number / 10;
		}
		return sum;
	}
}

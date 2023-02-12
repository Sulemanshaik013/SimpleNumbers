package com.operations;

import java.util.Scanner;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		int sum = sumOfFirstNNumber(number);

		System.out.println("Sum of first " + number + " numbers is " + sum);
		sc.close();
	}

	private static int sumOfFirstNNumber(int number) {
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += number;
		}
		return sum;
	}
}

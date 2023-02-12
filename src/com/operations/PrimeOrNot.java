package com.operations;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		isPrime(number);

		sc.close();
	}

	private static void isPrime(int number) {
		boolean flag = false;

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				flag = true;
			}
		}

		if (!flag) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
}

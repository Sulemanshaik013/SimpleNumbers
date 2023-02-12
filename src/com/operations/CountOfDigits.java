package com.operations;
import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		int count= countOfDigits(number);
		System.out.println("the count of digits in "+ number+ " is "+count);

		sc.close();
	}

	private static int countOfDigits(int number) {
		int cnt = 0,temp = number;
		while (temp != 0) {
			temp = temp / 10;
			cnt++;
		}
		return cnt;
	}
}

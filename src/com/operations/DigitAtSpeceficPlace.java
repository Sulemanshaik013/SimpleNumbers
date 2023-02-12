package com.operations;

import java.util.Scanner;

public class DigitAtSpeceficPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		System.out.println("Enter digit place");
		int pos = sc.nextInt();
		
		int digit = digitAtSpeceficPlace(number, pos);
		
		System.out.printf("The digit at %d's place in %d is %d",pos,number,digit);
//		System.out.println("the digit at position " + pos + "in number " + number + " is " + digit);

		
		sc.close();
	}

	private static int digitAtSpeceficPlace(int number, int pos) {
		int base = 10;
		return (int) ((number / Math.pow(base, pos - 1)) % base);
	}

}

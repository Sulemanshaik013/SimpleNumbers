package com.operations;
import java.util.Scanner;

public class FiboanacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int number = sc.nextInt();

		 fibonacci(number);
		sc.close();
	}

	private static void fibonacci(int number) {
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<number;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}

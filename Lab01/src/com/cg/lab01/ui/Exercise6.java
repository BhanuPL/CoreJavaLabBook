package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise6 {

	int i, j;
	int sum = 0;
	int sum1;

	public int squares() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			sum = sum + i * i;

		}
		System.out.println("sum of sqaures is:" + sum);
		for (int j = 0; j <= n; j++) {
			sum1 = sum1 + j;
		}
		int c = sum1 * sum1;
		System.out.println("square of sum is:" + c);
		int difference = c - sum;
		System.out.println("difference is" + difference);
		return n;
	}

	public static void main(String args[]) {
		Exercise6 scan = new Exercise6();
		scan.squares();
	}
}

package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise5 {

	static int sum = 0;

	static int calculateSum(int n)

	{
		for (int i = 1; i <= n; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(calculateSum(n));
		scan.close();
	}

}

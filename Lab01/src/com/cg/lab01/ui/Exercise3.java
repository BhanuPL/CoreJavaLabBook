package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise3 {

	static int a = 1, b = 1, c = 0;

	static int Fib(int n) {
		if (n > 0) {
			c = b;
			b = b + a;
			a = c;
			Fib(n - 1);
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(Fib(n - 1));
		scan.close();
	}
}

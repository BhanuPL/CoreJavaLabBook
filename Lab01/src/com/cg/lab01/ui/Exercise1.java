package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise1 {
	int j;
	int sum = 0;

	public int cubes() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int j = 1; j <= n; j++) {
			sum = sum + (j * j * j);
		}
		System.out.println(sum);
		return n;
	}

	public static void main(String args[]) {
		Exercise1 scan = new Exercise1();
		scan.cubes();

	}

}

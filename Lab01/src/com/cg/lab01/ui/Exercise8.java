package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int flag = 0;
		while (n != 1) {
			if (n % 2 != 0) {
				flag = 1;
				break;
			}
			n = n / 2;

		}
		if (flag == 0)
			System.out.println("The given number is a power of 2");
		else
			System.out.println("The given number is not a power of 2");

		scan.close();
	}
}

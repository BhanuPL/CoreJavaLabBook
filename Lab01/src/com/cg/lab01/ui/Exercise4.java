package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		int count;
		System.out.println("Enter the number:");
		n = scan.nextInt();
		for (int i = 2; i <= n; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 0)
				System.out.println(i);
		}
		scan.close();
	}
}

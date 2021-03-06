package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise7 {

	static Boolean checkNumber(int n) {
		int temp = n % 10;
		while (n > 0) {
			int r = n % 10;
			if (!(r <= temp)) {
				return false;
			}
			n -= r;
			n /= 10;
			temp = r;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(checkNumber(n));
		scan.close();
	}

}

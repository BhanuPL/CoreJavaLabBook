package com.cg.lab03.ui;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String args[]) {
		int i;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values:");
		String s = scan.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			i = Integer.parseInt(temp);
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum of the integers is: " + sum);
		scan.close();
	}
}

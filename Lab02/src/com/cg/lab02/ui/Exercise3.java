package com.cg.lab02.ui;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		int counter, i = 0, j = 0, temp;
		int number[] = new int[100];
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("No.of elements you want to enter: ");
		counter = scan.nextInt();

		for (i = 0; i < counter; i++) {
			System.out.print("Enter Array Element" + (i + 1) + ": ");
			number[i] = scan.nextInt();
		}

		j = i - 1;
		i = 0;

		while (i < j) {
			temp = number[i];
			number[i] = number[j];
			number[j] = temp;
			i++;
			j--;
		}

		System.out.print("Reversed array: ");
		for (i = 0; i < counter; i++) {
			System.out.print(number[i] + " ");
		}

		for (int k = 0; k < counter; k++) {
			for (int m = k + 1; m < counter; m++) {

				int tmp = 0;
				if (number[k] > number[m]) {
					tmp = number[k];
					number[k] = number[m];
					number[m] = tmp;

				}

			}

			System.out.println("\n After Sorting: ");
			System.out.println(number[k]);
		}
		scan.close();
	}
}

package com.cg.lab01.ui;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String light = scan.nextLine();

		switch (light) {
		case "red":
			System.out.println("STOP");
			break;
		case "green":
			System.out.println("GO");
			break;
		case "yellow":
			System.out.println("WAIT");
			break;
		}
		scan.close();
	}
}

package com.cg.lab03.ui;

import java.util.Scanner;

public class Exercise2 {

	public String getImage(String str) {
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}

	public static void main(String[] ar) {
		Exercise2 p = new Exercise2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine();
		System.out.println(p.getImage(str));
		scan.close();
	}

}
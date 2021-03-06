package com.cg.lab05.ui;

import java.util.Scanner;

public class Exercise1 {

	@SuppressWarnings("serial")
	class AgeException extends Exception {
		private String msg;

		public AgeException(String msg) {
			this.msg = msg;
		}

		public String toString() {
			return msg;
		}
	}

	public class AgeDemo {
		public void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter age: ");
			int age = scan.nextInt();
			scan.close();
			try {
				if (age < 18)
					throw new AgeException("Invalid age");
				else
					System.out.println("Valid age");
			} catch (AgeException a) {
				System.out.println(a);
			}
		}
	}

}

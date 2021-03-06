package com.cg.lab05.ui;

import java.util.Scanner;

public class Exercise2 {
	class InvalidException extends Exception {

		private static final long serialVersionUID = 1L;

		public InvalidException(String str) {
			System.out.println(str);
		}
	}

	public class EmpException {
		@SuppressWarnings("resource")
		public void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first name:");
			String firstname = scan.nextLine();
			System.out.println("Enter last name:");
			String lastname = scan.nextLine();

			try {
				if (firstname.length() == 0 || lastname.length() == 0) {
					throw new InvalidException("Invalid name");
				} else
					System.out.println("valid name");
			} catch (InvalidException a) {
				System.out.println(a);
			}
			scan.close();
		}
	}

}

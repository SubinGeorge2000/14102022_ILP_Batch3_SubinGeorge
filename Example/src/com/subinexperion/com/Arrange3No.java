package com.subinexperion.com;

import java.util.Scanner;

public class Arrange3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 3 No");
		firstNumber = scanner.nextInt();
		secondNumber = scanner.nextInt();
		thirdNumber = scanner.nextInt();
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber);
			if (secondNumber > thirdNumber) {
				System.out.println(secondNumber);
				System.out.println(thirdNumber);
			}

			else {
				System.out.println(thirdNumber);
				System.out.println(secondNumber);

			}
		}
		if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println(firstNumber);
			if (firstNumber > thirdNumber) {
				System.out.println(firstNumber);
				System.out.println(thirdNumber);
			} else {
				System.out.println(thirdNumber);
				System.out.println(firstNumber);

			}

		}
		if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.println(thirdNumber);
			if (secondNumber > firstNumber) {
				System.out.println(secondNumber);
				System.out.println(firstNumber);

			} else {
				System.out.println(firstNumber);
				System.out.println(secondNumber);

			}

		}

	}
}

package com.subinexperion.com;

import java.util.Scanner;

public class Arrange4No {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 3 No");
		firstNumber = scanner.nextInt();
		secondNumber = scanner.nextInt();
		thirdNumber = scanner.nextInt();
		fourthNumber = scanner.nextInt();
//1
		if (firstNumber>secondNumber && firstNumber>thirdNumber && firstNumber>fourthNumber) {
			System.out.println(firstNumber);
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
//2
		if (secondNumber>firstNumber && secondNumber>thirdNumber && secondNumber>fourthNumber) {
			System.out.println(secondNumber);
			if (firstNumber > thirdNumber && firstNumber > fourthNumber) {
				System.out.println(firstNumber);
				if (thirdNumber > fourthNumber) {
					System.out.println(thirdNumber);
					System.out.println(fourthNumber);
				}

				else {
					System.out.println(fourthNumber);
					System.out.println(thirdNumber);
				}
			}
			}
		
	}

}

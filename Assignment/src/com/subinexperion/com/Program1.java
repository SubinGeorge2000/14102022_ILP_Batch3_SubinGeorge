package com.subinexperion.com;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
			int numberOne;
			int numberTwo;
			int numberThree;
			int greatOne = 0;
			int greatTwo = 0;
			int greatThree = 0;

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the 3 numbers");

			numberOne = scanner.nextInt();
			numberTwo = scanner.nextInt();
			numberThree = scanner.nextInt();

			if (numberOne > numberTwo && numberOne > numberThree) {// checking if 1st number is greater than the rest
				if (numberTwo > numberThree) {
					greatOne = numberOne;
					greatTwo = numberTwo;
					greatThree = numberThree;
				} else if (numberThree > numberTwo) {
					greatOne = numberOne;
					greatTwo = numberThree;
					greatThree = numberTwo;
				}
			} else if (numberTwo > numberOne && numberTwo > numberThree) {// checking if 2nd number is greater than the rest
				if (numberOne > numberThree) {
					greatOne = numberTwo;
					greatTwo = numberOne;
					greatThree = numberThree;
				} else if (numberThree > numberOne) {
					greatOne = numberTwo;
					greatTwo = numberThree;
					greatThree = numberOne;
				}
			} else if (numberThree > numberOne && numberThree > numberTwo) {// checking if 3rd number is greater than the
																			// rest
				if (numberOne > numberTwo) {
					greatOne = numberThree;
					greatTwo = numberOne;
					greatThree = numberTwo;
				} else if (numberTwo > numberOne) {
					greatOne = numberThree;
					greatTwo = numberTwo;
					greatThree = numberOne;
				}
			}

			System.out.println(
					"\nThe numbers after sorting in descending order\n" + greatOne + "\t" + greatTwo + "\t" + greatThree);
		}
	}

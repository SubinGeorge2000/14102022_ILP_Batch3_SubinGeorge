package com.subinexperion.com;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOne;
		int numberTwo;
		int numberThree;
		int numberFour;
		int greatOne = 0;
		int greatTwo = 0;
		int greatThree = 0;
		int greatFour;

		System.out.println("Enter the 4 numbers");

		numberOne = scanner.nextInt();
		numberTwo = scanner.nextInt();
		numberThree = scanner.nextInt();
		numberFour = scanner.nextInt();



		int tmperoryVariable;
		if (numberOne > numberTwo) {// swapping numbers to shift the bigger number to last
			tmperoryVariable = numberOne;
			numberOne = numberTwo;
			numberTwo = tmperoryVariable;
		}
		if (numberThree > numberFour) {
			tmperoryVariable = numberThree;
			numberThree = numberFour;
			numberFour = tmperoryVariable;
		}
		if (numberOne > numberThree) {
			tmperoryVariable = numberOne;
			numberOne = numberThree;
			numberThree = tmperoryVariable;
		}
		if (numberTwo > numberFour) {
			tmperoryVariable = numberTwo;
			numberTwo = numberFour;
			numberFour = tmperoryVariable;
		}
		if (numberTwo > numberThree) {
			tmperoryVariable = numberTwo;
			numberTwo = numberThree;
			numberThree = tmperoryVariable;
		}

		System.out.println("\nThe numbers after sorting in ascending order\n" + numberOne + "\t" + numberTwo + "\t"
				+ numberThree + "\t" + numberFour);
		System.out.println("\nThe numbers after sorting in descending order\n" + numberFour + "\t" + numberThree + "\t"
				+ numberTwo + "\t" + numberOne);

		// TODO Auto-generated method stub

	}

}

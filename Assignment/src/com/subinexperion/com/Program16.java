package com.subinexperion.com;

import java.util.Arrays;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String");
		String inputString = scanner.nextLine();
		System.out.println("Enter the character to replace");
		char replaceChar = scanner.next().charAt(0);
		System.out.println("Enter the new character to be replaced");
		char newChar = scanner.next().charAt(0);
		int frequencyCount = 0;
		String newString = "";
		for (int index = 0; index < inputString.length(); index++) {
			if (inputString.charAt(index) == replaceChar) {
				frequencyCount++;
				newString = inputString.replace(inputString.charAt(index), newChar);
			}

		}
		if (frequencyCount == 0)
			System.out.println("The character is not present in the string");
		else
			System.out.println("The character occurs " + frequencyCount + " times.\nNew string after replacement is:\n"
					+ newString);

	}
	}
		 



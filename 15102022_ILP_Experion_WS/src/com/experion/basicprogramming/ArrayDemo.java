package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName[] = new String[5];
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Enter the five strings");
		for (i = 0; i < productName.length; i++) {
			productName[i] = scanner.nextLine();

		}
		for (i = 0; i < productName.length; i++) {

			System.out.println(productName[i]);

		}

	}

}

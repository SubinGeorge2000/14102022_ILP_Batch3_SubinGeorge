package com.subinexperion.com;

import java.util.Arrays;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int rangeVariable=scanner.nextInt();
		int numbers[] = new int[rangeVariable];

		System.out.println("Enter the array elements numbers");
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = scanner.nextInt();
		}

		System.out.println("The numbers before sorting");
		for (int temperoryNumber : numbers) {
			System.out.print(temperoryNumber + "     ");

		}

		Arrays.sort(numbers);

		System.out.println("\nThe numbers after sorting in ascending order");
		for (int count = 0; count < numbers.length; count++) {
			System.out.print(numbers[count] + "    ");
		}

		System.out.println("\nThe numbers after sorting in descending order");
		for (int count = (numbers.length) - 1; count >= 0; count--) {
			System.out.print(numbers[count] + "    ");
		}
		// TODO Auto-generated method stub

	}
}

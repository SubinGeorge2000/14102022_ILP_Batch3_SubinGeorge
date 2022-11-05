package com.subinexperion.com;

import java.util.Arrays;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int rangeVariable = scanner.nextInt();
		int numbers[] = new int[rangeVariable];

		System.out.println("Enter the array elements numbers");
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = scanner.nextInt();
		}

		Arrays.sort(numbers);

		int frequencyCount = 0;
		for (int index = 0; index < numbers.length; index++) {
			frequencyCount = 1;
			for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {
				if (numbers[index] == numbers[innerIndex])
					frequencyCount++;
				else
					break;

			}
			System.out.println(numbers[index] + "   occurs    " + frequencyCount + "  times");
			index += frequencyCount - 1;
		}

	}

}

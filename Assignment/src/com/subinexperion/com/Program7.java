package com.subinexperion.com;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Program7 fact = new Program7();
		fact.displaySum();
	}

	private void displaySum() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();

		double seriesSum = 0.0;
		for (int count = 1; count <= rangeVariable; count++) {
		
			seriesSum = seriesSum + (count / factorial(count*count));
			
		}
		System.out.println("Sum of series is:" + seriesSum);
		// TODO Auto-generated method stub

		
	}
	public double factorial(int count1) {
		double factVariable = 1;
		for (int index = 1; index <= count1; index++) {
			factVariable = factVariable * index;
		}
		return factVariable;
	}

	
	

}


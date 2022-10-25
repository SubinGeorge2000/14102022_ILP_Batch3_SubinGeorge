package com.ilpexperion.basicprogramming;
import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int swapNumber;
		System.out.println("Enter the First No");
		firstNumber=scanner.nextInt();
		System.out.println("Enter the Second No");
		secondNumber=scanner.nextInt();
		swapNumber=firstNumber;
		firstNumber=secondNumber;
		secondNumber=swapNumber;

	}

}

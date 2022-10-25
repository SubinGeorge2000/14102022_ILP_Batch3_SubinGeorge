package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapNo {

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
		firstNumber=firstNumber+secondNumber;
	    secondNumber=firstNumber-secondNumber;
	    firstNumber=firstNumber-secondNumber;
	    
	   
	}

}

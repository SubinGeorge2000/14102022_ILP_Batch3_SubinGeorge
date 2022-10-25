package com.ilpexperion.basicprogramming;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		System.out.println("Enter the First No");
		firstNumber=scanner.nextInt();
		System.out.println("Enter the Second No");
		secondNumber=scanner.nextInt();
		System.out.println("Enter the Third No");
		thirdNumber=scanner.nextInt();
		if(firstNumber>secondNumber && firstNumber>thirdNumber) {
			if(secondNumber<thirdNumber)
				System.out.println(thirdNumber+"is the second smallest no");
			else 
				System.out.println(secondNumber+"is the second smallest no");
		}
		if(secondNumber>firstNumber && secondNumber>thirdNumber) {
			if(firstNumber<thirdNumber)
				System.out.println(thirdNumber+"is the second smallest no");
			else 
				System.out.println(firstNumber+"is the second smallest no");
			
		}
				
		if(thirdNumber>firstNumber && thirdNumber>secondNumber) {
			if(firstNumber<secondNumber)
				System.out.println(secondNumber+"is the second smallest no");    
			else 
				System.out.println(firstNumber+"is the second smallest no");
			
		}
				
		

	}

}

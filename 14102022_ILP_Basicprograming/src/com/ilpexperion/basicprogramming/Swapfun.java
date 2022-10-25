package com.ilpexperion.basicprogramming;
import java.util.Scanner;

public class Swapfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		System.out.println("Enter the No");
		firstNumber=scanner.nextInt();
		secondNumber=firstNumber%10;
		if(secondNumber%2==0) {
			System.out.println("The Number is even");
		}
		else {
			System.out.println("The Number is odd");
		}
	}

}

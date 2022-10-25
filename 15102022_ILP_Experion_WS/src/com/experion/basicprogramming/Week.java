package com.experion.basicprogramming;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter the First No");
		number=scanner.nextInt();
		switch(number) {
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tues");
				break;
			case 3:
				System.out.println("wes");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("friday");
				break;
			case 6:
				System.out.println("satuarday");
				break;
			case 7:
				System.out.println("sunday");
				break;
			default:
				System.out.println("not"); 
		}

	}

}

package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char firstVowel;
		System.out.println("Enter the First No");
		firstVowel=scanner.next().charAt(0);
		switch(firstVowel) {
			case 'a':
				System.out.println("the character is vowel");
				break;
			case 'e':
				System.out.println("the character is vowel");
				break;
			case 'i':
				System.out.println("the character is vowel");
				break;
			case 'o':
				System.out.println("the character is vowel");
				break;
			case 'u':
				System.out.println("the character is vowel");
				break;
			default:
				System.out.println("the character is  not vowel"); 
				
			
		}
		

	}

}

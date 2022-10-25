package com.subinexperion.com;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		Fibonacci(n);

	}
	static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

}

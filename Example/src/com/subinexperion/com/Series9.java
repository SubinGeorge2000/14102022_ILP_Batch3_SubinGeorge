package com.subinexperion.com;

import java.util.Scanner;

public class Series9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt(); 
        printNums(n); 
	}
	public static void printNums(int n) 
    { 
        int i, j,num; 
        for(i=0; i<n; i++) 
        { 
            num=1; 
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");           
                num++; 
            }
            System.out.println(); 
        } 
    } 

}

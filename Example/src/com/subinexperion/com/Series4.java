package com.subinexperion.com;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  int n = sc.nextInt();
		  int i = 1, c, f = 1,sum=0,sum1=0, y=0;
		  for(i=1;i<n;i++) {
			  y=find(n);
			  sum=sum+y;
		  }
		  System.out.println(sum);
	}
	public static int find(int n) {
		return (int)Math.pow(n, 3);
	}*/
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number of terms: ");
		 int n = sc.nextInt();
		 int i=0,sum=1,y=0;
		 for(i=1;i<=n;i++) {
			 sum=i*i*i;
			 y=y+sum;
		 }
		 System.out.println(y);
		 
	
	}
}

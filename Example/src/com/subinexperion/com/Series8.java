package com.subinexperion.com;

import java.util.Scanner;

public class Series8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  double n = sc.nextDouble();
		  double i = 1, c, f =0;  
		  double s = 0,e=0,sum=0;
		for(i=1;i<=n;i++) {
			s=square(i)+fact(i);
			e=(i/s);
			sum=sum+e;
		  }
		  System.out.println(sum);
		  

	}
	public static double fact(double c) {
		if(c==1)
			return 1;
		else
			return c*(c-1);
		
	}
	public static double square(double f )
	{
		return f*f;
		
	}

}

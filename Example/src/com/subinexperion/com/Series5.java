package com.subinexperion.com;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  int n = sc.nextInt();
		  int i = 1, c, f = 1,sum=0;                            // i for odd nos, c for counter, f for flag
		  for (c = 1; c <= n; c++) {
		   if (f % 2 == 0) {
		    //System.out.print(-i + " ");
			   sum+=-(Math.pow(i, c));
			   
		   } else {
		    //System.out.print(i + " ");
			   sum+=(Math.pow(i, c));
		   }
		   i += 2;
		   f++;
		  }  
		  //Loop ends
		  System.out.println(sum);

}
}

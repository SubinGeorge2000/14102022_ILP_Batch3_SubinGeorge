package com.subinexperion.com;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  int n = sc.nextInt();
		  int i = 1, c, f = 1,sum=0;                         
		  for (c = 1; c <= n; c++) {
		   if (f % 2 == 0) {
		    //System.out.print(-i + " ");
			   sum+=-i;
		   } else {
		    //System.out.print(i + " ");
			   sum+=i;
		   }
		   i += 2;
		   f++;
		  }  
		  //Loop ends
		  System.out.println(sum);

}
}

package com.experion.utility;
import java.util.Scanner;

import com.experion.service.Service;
public class ProductUtility {

	public static void main(String[] args) {
		int number;
		Service service =new Service();
		Scanner scanner =new Scanner(System.in);
		do {
		System.out.println("Enter 1 for stock updation and 2 for stock details");
		number=scanner.nextInt();
		if(number==1) {
			service.stockUpdation();
		}
		if(number==2) {
			service.stockDisplay();
		}
		Scanner i =new Scanner(System.in);
		System.out.println("do you want to continue type y");
		scanner=i.next().charAt(0);
		}while(i=='y');
		
		
	}
		

}

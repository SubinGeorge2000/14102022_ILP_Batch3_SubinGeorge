package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------Welcome to our Shop--------------");
		char mainChoice, cusChoice = 'n';
		//int index = 0;
		int customerChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		do {
			System.out.println("1. input Product  2. Display Product");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1.Fabric 2.Electronics");
				int choice1 = scanner.nextInt();
				if(choice1==1) {
					productList.add(Service.inputProductFabric());
				    //index++;
				}
				else 
					productList.add(Service.inputProductElectronics());
				break;
			case 2:
				Service.displayProductDetails(productList);
			}
			System.out.println("Do you want to continue (y/n):");
			mainChoice = scanner.next().charAt(0);
		}while (mainChoice == 'y');
			
			System.out.println("which product do you want,choice its serial No");
			customerChoice = scanner.nextInt();
			Service.customerProduct(customerChoice, productList);
			
	}
	}

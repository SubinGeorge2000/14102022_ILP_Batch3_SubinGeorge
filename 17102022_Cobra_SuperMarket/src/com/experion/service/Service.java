package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	Product productliist[]= new Product[3];
	int i;
	char scan
	Scanner scan =new Scanner();
	public void stockUpdation() {
		
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Proudct Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Valdity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) - ");
		boolean active = scanner.nextBoolean();
		productliist[i].setProductCode(productCode);
		productliist[i].setProductName(productName);
		productliist[i].setProductDescription(productDescription);
		productliist[i].setProductPrize(productPrice);
		productliist[i].setOpenDate(openDate);
		productliist[i].setExpriryDate(expiryDate);
		productliist[i].setValilidyDate(validityDate);
		System.out.println("enter 1 for continue");
		scanner=scan.next().charAt(0);
		i++;
		}while(i==1);
		*/

	}

	public void stockDisplay() {
		for(i=0;i<3;i++) {

		System.out.println("Product Name " + "		" + "Product Description" + "		" + "Product Price"
				+ "			" + "Open Date" + "		" + "Expiry Date");
		System.out.println(productliist[i].getProductName() + "				" + productliist[i].getProductDescription() + "				" + productliist[i].getProductPrize()
				+ "		" + productliist[i].getOpenDate() + "		" + productliist[i].getExpriryDate());

	}

	}
	
	

}

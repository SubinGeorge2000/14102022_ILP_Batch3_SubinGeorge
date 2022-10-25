package com.experion.entity;

import java.util.Scanner;

public class Product {
	String productCode;
	String productName;
	String productDescription;
	String openDate;
	double productPrize;
	String valilidyDate;
	String expriryDate;
	boolean active;

	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the prodct code");
		productCode = scanner.nextLine();
		System.out.println("enter the prodct Name");
		productName = scanner.nextLine();
		System.out.println("enter the prodct description");
		productDescription = scanner.nextLine();
		System.out.println("enter the product Prize");
		productPrize = scanner.nextDouble();
		scanner.nextLine(); 
		System.out.println("enter the open Date");
		openDate = scanner.nextLine();
		System.out.println("enter the validity Date");
		valilidyDate = scanner.nextLine();
		System.out.println("enter the expriry Date- ");
		expriryDate = scanner.nextLine();
		System.out.println("Active(true or False)- ");
		active = scanner.nextBoolean();

	}
 
      public void displayProductDetails() {

            System.out.println("Product Name " + " " + "Product Description" + " " + "Product Price"
            + " " + "Open Date" + " " + "Expiry Date");
            System.out.println(productName + " " + productDescription + " " + productPrize
            + " " + openDate + " " + expriryDate);

		
	}
	

}

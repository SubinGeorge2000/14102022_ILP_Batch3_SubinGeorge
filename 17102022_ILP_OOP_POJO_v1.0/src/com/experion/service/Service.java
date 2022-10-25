package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	public static  Product createProduct() 
	 {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the prodct code");
		String productCode = scanner.nextLine();
		//product.setProductCode(productCode);
		System.out.println("enter the prodct Name");
		String productName = scanner.nextLine();
		//product.setProductName(productName);
		System.out.println("enter the prodct description");
		String productDescription = scanner.nextLine();
		//product.setProductDescription(productDescription);
		System.out.println("enter the product Prize");
		double productPrize = scanner.nextDouble();
		//product.setProductPrize(productPrize);
		scanner.nextLine(); 
		System.out.println("enter the open Date");
		String openDate = scanner.nextLine();
		//product.setOpenDate(openDate);
		System.out.println("enter the validity Date");
		String valilidyDate = scanner.nextLine();
		//product.setValilidyDate(valilidyDate);
		System.out.println("enter the expriry Date- ");
		String expriryDate = scanner.nextLine();
		//product.setExpriryDate(expriryDate);
		System.out.println("Active(true or False)- ");
		boolean active = scanner.nextBoolean();

	
	Product product=new Product(productCode,productName,productDescription,productPrize,openDate,valilidyDate,
			expriryDate,active);
	return product;
	}
      public static  void displayProductDetails(Product productList[]) {

            System.out.println("Product Name " + " " + "Product Description" + " " + "Product Price"
            + " " + "Open Date" + " " + "Expiry Date");
            for(Product product: productList) 
            {
            	if(product!=null) {
			System.out.println(product.getProductCode() + " " + product.getProductDescription() + " " + product.getProductPrize()
            + " " + product.getOpenDate() + " " + product.getExpriryDate());
            }
            }
		
	
	}
	
}

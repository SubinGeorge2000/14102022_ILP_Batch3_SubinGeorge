package com.experion.service;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	public static Product createProduct() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code : ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name : ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description : ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price : ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date : ");
		String openDate = scanner.nextLine();
		Date dateOpen = covertStringtoDate(openDate);
		System.out.println("Enter Product Validity Date : ");
		String validityDate = scanner.nextLine();
		Date dateValidity = covertStringtoDate(validityDate);
		System.out.println("Enter Product Expiry Date : ");
		String expiryDate = scanner.nextLine();
		Date dateExpiry = covertStringtoDate(expiryDate);

		Product product = new Product(productCode, productName, productDescription, productPrice, dateOpen,
				dateValidity, dateExpiry);
		product.setSerialNo(product.getSerialNo() + 1);
		product.setSerialNoOriginal(product.getSerialNo());
		return product;
	}

	private static Date covertStringtoDate(String date) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date covertedDate = formatter.parse(date);
		return covertedDate;
	}

	public static void displayProductDetails(ArrayList<Product> productList) {
		System.out.println("Sl No. " + "	" + "Product Code " + "	" + "Product Name " + "	" + "Product Description "
				+ "	" + "Product Price " + "	" + "Product Open Date " + "	" + "Product Validity Date " + "	"
				+ "Product Expiry Date ");
		for (Product product : productList) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			if (product != null)

				System.out.println(product.getSerialNoOriginal() + "	" + product.getProductCode() + "		"
						+ product.getProductName() + "			" + product.getProductDescription() + "			"
						+ product.getProductPrice() + "			" + dateFormat.format(product.getOpenDate())
						+ "			" + dateFormat.format(product.getValidityDate()) + "			"
						+ dateFormat.format(product.getExpiryDate()));
		}
	}

	public static void customerProduct(int customerChoice, ArrayList<Product> productList, Date currentDate) {
		for (Product product : productList) {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			if (product.getSerialNoOriginal() == customerChoice) {
				System.out.println(product.getProductCode() + "		" + product.getProductName() + "			"
						+ product.getProductDescription() + "			" + product.getProductPrice() + "			"
						+ dateFormat.format(product.getExpiryDate()));

				{
					if ((product.getExpiryDate().compareTo(currentDate)>0)||(product.getExpiryDate().compareTo(currentDate)==0)) {
						if ((product.getValidityDate().compareTo(currentDate)>0)||(product.getValidityDate().compareTo(currentDate)==0)) {
							if ((product.getOpenDate().compareTo(currentDate)>0) ||(product.getOpenDate().compareTo(currentDate)==0))
								System.out.println("Product is Active.");
							else
								System.out.println("Manufacturing not completed.");
						} else
							System.out.println("Cannot purchase.");
					} else
						System.out.println("Product is Not Active.");
				}
			}

		}

	}

	public static Product inputProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}

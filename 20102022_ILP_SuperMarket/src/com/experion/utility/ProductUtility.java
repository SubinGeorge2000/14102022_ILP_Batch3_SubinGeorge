package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		char mainChoice;
		Product product = null;
		Product selectedProduct = null;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
		do {
			System.out.println(
					"1.Create Fabric Product    2.Create Electronic Product    3.Buy Product    4.Product Services");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				productList.add(Service.createProduct("Fabrics"));
				break;
				
			case 2:
				productList.add(Service.createProduct("Electronics"));
				break;
				
			case 3:
				selectedProduct = Service.buyProduct(productList);
				scanner.nextLine();
				System.out.println("Enter Customer Code : ");
				String customerCode = scanner.nextLine();
				System.out.println("Enter Customer Name : ");
				String customerName = scanner.nextLine();
			 	customer = new Customer(customerCode, customerName, selectedProduct);
				customerList.add(customer);
				System.out.println("Thank you for purchase");
				break;
				
			case 4:
				Service.getProductService(customerList);
				break;

			}
			System.out.println("Do you want to continue (y/n):");
			mainChoice = scanner.next().charAt(0);

		} while (mainChoice == 'y'||mainChoice=='Y');
		System.out.println("Thank you Visit again!");
	}

}

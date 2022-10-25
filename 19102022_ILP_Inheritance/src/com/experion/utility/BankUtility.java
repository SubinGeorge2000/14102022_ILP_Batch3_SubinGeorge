package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product>productList=new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);
		char mainchoice;
		do {
		System.out.println("1.Add Card Product, 2.Add Account Product, 3.Buy Product");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			productList.add(Service.createProduct("Cards"));
			break;
		case 2:
			productList.add(Service.createProduct("Accounts"));
			break;
		case 3:
			Service.displayProduct(productList);
			break;
		default:
			System.out.println("invalid choice");
		}
		System.out.println("Do you want to continue(y/n)");
		mainchoice=scanner.next().charAt(0);
		}
		while(mainchoice=='y');

	}

}

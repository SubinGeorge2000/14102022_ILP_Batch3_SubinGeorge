package com.experion.service;
import java.util.ArrayList;

import java.util.Scanner;
import com.experion.entity.Electronic;
import com.experion.entity.Fabric;
import com.experion.entity.Product;

public class Service {

	public static void displayProductDetails(ArrayList<Product> productList) {
		// TODO Auto-generated method stub
		System.out.println("serial NO"+"   "+"Product name"+"   "+"Size/Company");
		for (Product product : productList) {
			
			if(product instanceof Fabric) {
				Fabric fabric = (Fabric)product;
			    System.out.println(product.getSerialNoOriginal()+"  "+product.getProductName()+"   "+fabric.getSize());
			}
			//System.out.println(product.getSerialNoOriginal()+product.getProductName() +product.get)));
			if(product instanceof Electronic) {
				Electronic fabric = (Electronic)product;
			    System.out.println(product.getSerialNoOriginal()+"  "+product.getProductName()+"   "+fabric.getCompany());
			}
		}
		
	}

	public static void customerProduct(int customerChoice, ArrayList<Product> productList) {
		// TODO Auto-generated method stub
        for (Product product : productList) {
        	if(product.getSerialNoOriginal()==customerChoice) {
			if(product instanceof Fabric) {
				//Fabric fabric = (Fabric)product;
			    //System.out.println("Your are eligible for product Exchange");
			    product.productExchange();
			}
			    
			if(product instanceof Electronic) {
				//Fabric fabric = (Fabric)product;
			    //System.out.println("Your are eligible for product Exchange");
				product.productExchange();
			    ((Electronic)product).productRepair();
				((Electronic) product).warrantyReplacement();
			}
			}
        }
		
	}
	public static Product inputProductFabric() {
		// TODO Auto-generated method stub
		//ArrayList<Product>product=new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Name : ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product size : ");
		String size = scanner.nextLine();
		//Product product=null;
		
		//Product product = new product(productName, size);
		Product product=null;
		//Product product = new Product(productName,company);
		product =new Fabric(productName,size);
		product.setSerialNo(product.getSerialNo() + 1);
		product.setSerialNoOriginal(product.getSerialNo());
		return product;
	}

	public static Product inputProductElectronics() {
		// TODO Auto-generated method stub
		//ArrayList<Product>product=new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Name : ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product company : ");
		String company = scanner.nextLine();
		Product product=null;
		//Product product = new Product(productName,company);
		product =new Electronic(productName,company);
		product.setSerialNo(product.getSerialNo() + 1);
		product.setSerialNoOriginal(product.getSerialNo());
		return product;
	}
	

}

package com.experion.entity;

import com.experion.service.ProductRepair;
import com.experion.service.WarrantyReplacement;

public class Electronic extends Product implements ProductRepair, WarrantyReplacement{
	private String company;

	

	

	public Electronic(String productName, String company) {
		super(productName);
		this.company = company;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	@Override
	public void productExchange() {
		// TODO Auto-generated method stub
		System.out.println("you are eligible for product Exchange");
		
		
	}



	@Override
	public void productRepair() {
		// TODO Auto-generated method stub
		System.out.println("you are eligible for product Repair ");
		
	}



	@Override
	public void warrantyReplacement() {
		// TODO Auto-generated method stub
		System.out.println("you are eligible for Warranty Replacement with Service Charges");
		
		
	}
	
	
	

}

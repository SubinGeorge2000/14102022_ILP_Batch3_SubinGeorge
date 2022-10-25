package com.experion.entity;

public class Fabric extends Product {
	private String size;
	
	

	public Fabric(String productName, String size) {
		super(productName);
		this.size = size;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	@Override
	public void productExchange() {
		// TODO Auto-generated method stub
		System.out.println("you are eligible for product Exchange");
		
	}
	
	

}

package com.experion.entity;

import java.util.Date;

import com.experion.service.FabricService;

public class Fabrics extends Product implements FabricService {
	private String productSize;

	
	public Fabrics(String productCode, String productName, double productPrice, String productSize) {
		super(productCode, productName, productPrice);
		this.productSize = productSize;
	}
	


	public String getProductSize() {
		return productSize;
	}



	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}



	@Override
	public void productExchange() {
		
		System.out.println("Fabric product exchanged");
		
	}

}

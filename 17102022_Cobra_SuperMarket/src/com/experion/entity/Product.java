package com.experion.entity;

import java.util.Scanner;

public class Product {
	private String productCode;
	private String productName;
	private String productDescription;
	private String openDate;
	private double productPrize;
	private String valilidyDate;
	private String expriryDate;
	private boolean active;
	/*
	public Product() {
		
	}
		
		public Product(String productCode, String productName, String productDescription, double productPrize,String openDate,
			 String valilidyDate, String expriryDate, boolean active) {
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.openDate = openDate;
		this.productPrize = productPrize;
		this.valilidyDate = valilidyDate;
		this.expriryDate = expriryDate;
		this.active = active;
	}
*/
					
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public double getProductPrize() {
		return productPrize;
	}
	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}
	public String getValilidyDate() {
		return valilidyDate;
	}
	public void setValilidyDate(String valilidyDate) {
		this.valilidyDate = valilidyDate;
	}
	public String getExpriryDate() {
		return expriryDate;
	}
	public void setExpriryDate(String expriryDate) {
		this.expriryDate = expriryDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}

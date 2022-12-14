package com.experion.entity;

public abstract class Product {
	private String productName;
	private static int serialNo = 0;
	private int serialNoOriginal;
	public Product(String productName) {
		super();
		this.productName = productName;
		this.serialNoOriginal = serialNoOriginal;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public static int getSerialNo() {
		return serialNo;
	}
	public static void setSerialNo(int serialNo) {
		Product.serialNo = serialNo;
	}
	public int getSerialNoOriginal() {
		return serialNoOriginal;
	}
	public void setSerialNoOriginal(int serialNoOriginal) {
		this.serialNoOriginal = serialNoOriginal;
	}
	public abstract void productExchange();
	

}
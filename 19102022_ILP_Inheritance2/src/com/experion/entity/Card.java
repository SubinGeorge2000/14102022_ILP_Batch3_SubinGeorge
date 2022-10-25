package com.experion.entity;


public class Card extends Product {
	private String cardType;

	public Card(String productcode, String productName, String productType, String cardType) {
		super(productcode, productName, productType);
		this.cardType = cardType;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	

}

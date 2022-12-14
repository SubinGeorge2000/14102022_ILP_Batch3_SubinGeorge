package com.experion.service;

import java.util.ArrayList;


import com.experion.entity.Account;
import com.experion.entity.BankService;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {
	
	public static Product createProduct(String productType) {
		//Card card=new Card("PRMC100","MasterCard","Cards","Master");
				ArrayList<BankService>bankService=new ArrayList<BankService>();
				//bankService.add(new BankService(""))
				BankService onlineBanking=new BankService("SOB100","Online BAnking");
				BankService cashDeposit=new BankService("SOB200","cash BAnking");
				bankService.add(onlineBanking);
				bankService.add(cashDeposit);
				Product product=null;
				if(productType.compareTo("Cards")==0) {
					product =new Card("PRDMC100","MasterCard","Cards","Master");
				}
				else if(productType.compareTo("Accounts")==0) {
					product= new Account("PRDWSA100","Womens Savings Account","Accounts","Savings account",bankService);//inheritance advantages
				}
				return product;
	}
	

	public static void displayProduct(ArrayList<Product> productList) {
		
		// TODO Auto-generated method stub
		Card card=null;
		Account account=null;
		System.out.println("product Code"+"   "+"Product Name"+"    "+"Product Type"+"   "+"Card or Account");
		for(Product product:productList) {
			
			if(product instanceof Card) {
				card=(Card)product;
			    System.out.println(card.getProductcode()+"  "+card.getProductName()+"   "+card.getProductType()+"   "+card.getCardType());
			}
			else if (product instanceof Account) {
				account=(Account)product;
				System.out.println(account.getProductcode()+"  "+account.getProductName()+"   "+account.getProductType()+"   "+account.getAccountType()+"  "
						+account.getBankService());
				System.out.println("The list of Servies are given below");
				for(BankService bankService:account.getBankService()) {
					System.out.println(bankService.getServiceName());
					
				}
				
			}
		}
		
	}
	
	


}

package com.experion.service;

import com.experion.entity.Account;

public class AccountService {
	
	public void depositCash(Account account,double amount) {
		System.out.println("depositing money over the counter");
	}
    public void depositCash(Account account,String chequeNuber,double amount) {
    	System.out.println("depositing money via cheque");
		
	}
    public void depositCash(Account account,double amount,String upicode) {
    	System.out.println("depositing money ovia online trafer");
		
	}

}
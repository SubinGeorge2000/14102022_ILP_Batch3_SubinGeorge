package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;
import com.experion.service.AccountService;

public class BankUtility {
	public static void main(String[] arg) {
		/*Account account=new Account("Women Saving Account","Acc234",1000);
		AccountService accountservice=new AccountService();
		accountservice.depositCash(account,20000);
		accountservice.depositCash(account,0,"subin@.com");
		accountservice.depositCash(account,"HHVDHVD",20000);*/
		Product product=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Account 2.card 3.loan");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			product=new Account("Womens Savings Account","ABDH",10000);
			Account account=(Account)product;
			account.checkBalance();
			account.cashWithdraw();
			
		}
		
		else if(choice==2) {	
			product=new Card("Master Card","BHSGHDCB",10000);
			Card card =(Card)product;
			card.cashWithdraw();
			card.getCardBalance();
		}
		else if(choice==3) {
			product=new Loan("HOme Loan","LOAN2343",1000000);
			Loan loan=(Loan)product;
			loan.checkDueDate();
			loan.loanApproval();
			
		}
		product.checkProductValidity();
	}

	


}

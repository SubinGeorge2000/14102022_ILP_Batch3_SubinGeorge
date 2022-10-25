package com.experion.entity;

import com.experion.service.LoanService;

public class Loan extends Product implements LoanService {
	private String loanNumber;
	private double loanAmmount;
	
	public Loan(String productName, String loanNumber, double loanAmmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmmount = loanAmmount;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAmmount() {
		return loanAmmount;
	}
	public void setLoanAmmount(double loanAmmount) {
		this.loanAmmount = loanAmmount;
	}
	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity check loan class called");
		
	}
	@Override
	public void checkDueDate() {
		// TODO Auto-generated method stub
		System.out.println("check due Date ");
		
	}
	@Override
	public void loanApproval() {
		// TODO Auto-generated method stub
		System.out.println("Loan Appproval");
		
	}
	
	
	
	
	

}

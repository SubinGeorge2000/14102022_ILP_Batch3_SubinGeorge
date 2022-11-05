package com.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService {
	public static Service createService() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the follwind details to create service");
		System.out.println("service code :-");
		String serviceCode=scanner.nextLine();
		System.out.println("service name :-");
		String serviceName=scanner.nextLine();
		System.out.println("service description :-");
		String serviceDesc=scanner.nextLine();
		System.out.println("open Date :-");
		String openDate=scanner.nextLine();
		System.out.println("validity date :-");
		String validityDate=scanner.nextLine();
		System.out.println("expriry date :-");
		String expriryDate=scanner.nextLine();
		
		Date openDateConverted=stringToDate(openDate);
		Date validityDateConverted=stringToDate(validityDate);
		Date expriryDateConverted=stringToDate(expriryDate);
		
		
		
		// creeation of service object
		Service service=new Service(serviceCode,serviceName, serviceDesc, openDateConverted,validityDateConverted,expriryDateConverted);
		return service;
		
	}

	public static void createRateCard(Service service) {
       
		Scanner scanner=new Scanner(System.in);
		Rate rate =new Rate();
		System.out.println("*************enter the rate card"+service.getServiceName()+"************");
		System.out.println("Enter the tier you want to add");
		int notoTiers=scanner.nextInt();
		int[]min=new int[notoTiers];
		int []max=new int[notoTiers];
		double[] fees=new double[notoTiers];
		for(int tier=0;tier<notoTiers;tier++) {
			System.out.println("Enter the MIN MAX RATE for "+(tier+1)+"tier");
			min[tier]=scanner.nextInt();
			max[tier]=scanner.nextInt();
			fees[tier]=scanner.nextDouble();
			System.out.println("successfully inserted values in the "+(tier+1)+"tier");
			System.out.println("do you add more tiers -(y/n)");
			if(tier<notoTiers) {
			char ch=scanner.next().charAt(0);
			if(ch=='y')
				continue;
			else 
				break;
			}
			}
		service.setRate(rate);
		service.getRate().setMin(min);//first set then get
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		

	}

	public static void displayServiceDetails(Service service) {
		// TODO Auto-generated method stub
		System.out.println("*********service details*****");
		System.out.println("serviceCode"+"    "+"serviceName"+"serviceDesc"+"openDateConverted"+"validityDateConverted"+"expriryDateConverted");
		System.out.println(service.getServiceCode()+"    "+service.getServiceName()+""+service.getServiceDesc()+""+service.getOpenDate()+
				service.getValidityDate()+" "+service.getExpiryDate());
		System.out.println("********th e rate card*************"+service.getServiceName());
		System.out.println("MIN MAX RATE");
		for(int index=0;index<service.getRate().getMin().length;index++) {
			if((service.getRate().getMax()[index]<=99999) && (service.getRate().getMax()[index]!=0))
			System.out.println(service.getRate().getMin()[index]+""+service.getRate().getMax()[index]+""+service.getRate().getRate()[index]);
			
		}
		
		System.out.println(service);
		System.out.println(service.getRate());
		
	}
	public static Date stringToDate(String dateString)
	{   
		Date convertedDate=null;
		try {
	    convertedDate=new SimpleDateFormat("dd/MM/yyyy").parse(dateString);  
		return convertedDate;
		}
		catch (Exception e) {
			System.out.println("e.getMessage()");
		}
		return convertedDate;
		
	}

}

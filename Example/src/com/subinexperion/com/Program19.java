 package com.subinexperion.com;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String sc,scc;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first Date");
		sc=scanner.nextLine();
		System.out.println("enter the Second Date");
		scc=scanner.nextLine();
		Date date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(sc);  
		Date date2=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(scc);  
		System.out.println("the difference between two dates");
		 // Calucalte time difference in milliseconds   
        long time_difference = date2.getTime() - date1.getTime();  
        // Calucalte time difference in days  
        long days_difference = (time_difference / (1000*60*60*24)) % 365;   
        // Calucalte time difference in years  
        long years_difference = (time_difference / (1000l*60*60*24*365));   
        // Calucalte time difference in seconds  
        long seconds_difference = (time_difference / 1000)% 60;   
        // Calucalte time difference in minutes  
        long minutes_difference = (time_difference / (1000*60)) % 60;   
          
        // Calucalte time difference in hours  
        long hours_difference = (time_difference / (1000*60*60)) % 24;   
        // Show difference in years, in days, hours, minutes, and seconds   
        System.out.print(   
            "Difference "  
            + "between two dates is: ");   
        System.out.println(   
            years_difference   
            + " years, "  
            + days_difference   
            + " days"  
            );   
    }   

	}


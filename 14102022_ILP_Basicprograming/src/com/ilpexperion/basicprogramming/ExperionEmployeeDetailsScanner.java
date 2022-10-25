package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class ExperionEmployeeDetailsScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String trainingName = "********Welcome to ILP Program*********";
		String employeeName;
		int employeeAge;
		char employeeGender;
		double employeeCgpa;
		System.out.println("Enter the Employee Name-  ");
		employeeName=scanner.nextLine();
		System.out.println("Enter the Employee age-  ");
		employeeAge=scanner.nextInt();
		System.out.println("Enter the Employee Gender-  ");
		employeeGender=scanner.next().charAt(0);
		System.out.println("Enter the Employee CGPA   ");
		employeeCgpa=scanner.nextDouble();
		
		System.out.println("********Welcome to ILP Program*********");
		System.out.println("Name"+"       "+"Age"+"    "+"Gender"+"    " +"CGPA");
		System.out.println(employeeName +"   "+employeeAge+ "   "+employeeGender+"   "+employeeCgpa);
	}

}

package com.subinexperion.com;

import java.util.Arrays;
import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		 String info = "javaTpoint is the best learning website";    
	        char str[] = info.toCharArray(); 
	        int len = str.length;  
	        removeDuplicate(str, len);   
	    } 
	    static void removeDuplicate(char str[], int length)   
	    {     
	        int index = 0;   
	        for (int i = 0; i < length; i++)   
	        {    
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }     
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
	    }   
		

	}



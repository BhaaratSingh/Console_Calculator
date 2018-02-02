package com.honeywell;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class ConsoleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner scan = new Scanner(System.in); 
	 
	 System.out.println("#####Menue#####");
	 System.out.println("Please Type any of the below give string");
	 System.out.println("1. To calculate");
	 System.out.println("2. To exit the calculator\n\n");
	
	 int option= scan.nextInt();
		
	 
	 
	 
	 
	 switch(option)
	 {
	 case 1:
		 calculate();
		 System.out.println("You have to re run the program");
		 System.exit(0);
		  
		 break;
		 
	 case 2: 

		 System.exit(0);	 
		 break;
		 
	 default:
	     System.out.println("Invalid Option");
	 
	 }
	 
		
		
	}
	
 public static  void calculate()
  {
	 double PI = 3.1415927;
	 double E = 2.71828;
	
	 double result=0;
	  
	  System.out.println("You can now give the inputs on the console");
	  System.out.println("If you have to exit then you can Type \"Exit\" on the console and press enter ");
	  
	  Scanner scan = new Scanner(System.in);
	  
	  String inp=" ";
	  
	  while(true)
	  {
		  inp= scan.nextLine();
		   
		 if(inp.equalsIgnoreCase("exit"))
		 {
			return; 
			 
		 } 
		
		 int flag=0;
		    ArrayList<Double> numAl= new ArrayList<Double>();
		    ArrayList<Character> expAl= new ArrayList<Character>();
		
		 for(int i=0;i<inp.length();i++)
		 {
			if(flag==1)
			{
				flag=0;
				continue;
				
			}
			
			
		    
		    if(inp.charAt(i)=='-')
			{
				numAl.add(-(double)inp.charAt(i+1));
			    flag=1;	
			    continue;
			}
		    if(inp.charAt(i)=='+'||inp.charAt(i)=='*'||inp.charAt(i)=='/')
		    {
		    	expAl.add(inp.charAt(i));
		    	
		    }
		    if(inp.charAt(i)=='P'|| inp.charAt(i)=='p')
			{
				numAl.add(3.1415927);
			    flag=1;	
			    continue;
			}
		       
			
		}
		
		
		int flag1= 1;
		 
		double output=0;
		  
		while(flag1==1)
           {
			if(expAl.contains("/"))
			{
			    	
			
			}
			
			else if(expAl.contains("*"))
			{
				
				
				
			}
			else
			{
				
			for(double x : expAl)
			{
				output+=x;
			    
				
			}
			 flag=0;	
				break;
				
			}
			
			
		}
		
		
		
		 
		 
		 
			 
			 
		  
		 System.out.println(output+"\n"+">");	     
		  
		  
	  }
	  
	  
	  

  }
	
	
	
	

}

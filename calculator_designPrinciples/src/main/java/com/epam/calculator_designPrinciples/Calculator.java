package com.epam.calculator_designPrinciples;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double num1,num2;
		 int userChoice;

	    System.out.print("Enter The First Number: ");
	    num1 = sc.nextDouble();
	    System.out.print("Enter The Second Number: ");
	    num2 = sc.nextDouble();
	    System.out.println("Please Select One of the Operations to Perform:");
	    System.out.println(" 1-Add \t 2-Sub \t 3-Div \t 4-Mul");
	    userChoice = sc.nextInt();
	    do {
		    switch (userChoice){
		    
		    case 1: Addition add=new Addition();
		    		add.opp(num1, num2);
		    		break;
		
		    case 2: Subtraction sub=new Subtraction();
		    	    sub.opp(num1, num2);
		            break;
		   
		    case 3: Division div=new Division();
		           	div.opp(num1, num2);
		           	break;
		   
		    case 4: Multiplication mul=new Multiplication();
		           	mul.opp(num1, num2);
		           	break;
		    }
		    System.out.println("Do you want to continue?(-1 for exit!) ");
		    userChoice = sc.nextInt();
	    }
	    while(userChoice != -1);


   }
}

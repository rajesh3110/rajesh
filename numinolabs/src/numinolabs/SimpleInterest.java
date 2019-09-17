package numinolabs;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount :");
	double amount=sc.nextDouble();
	
	
    System.out.println("Enter the  rate :");
    double rate=sc.nextDouble();
	for(int i=1;i<=rate;i++)
	{
    
    System.out.println("Interested Will Be if interest rate will "+i+"then  "+cal(amount,i));
	}
	}
	
	
	public static double cal(double amount,double rate)
	{
		return (amount*(rate/100));
		
	}

}

package numinolabs;

import java.util.Scanner;

public class LCM {
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  first number ");
	int n=sc.nextInt();
	System.out.println("Enter second number ");
	int n1=sc.nextInt();
	int lcm=(n>n1)?n:n1;
	
	while(true)
	{
		if(lcm%n==0&&lcm%n1==0)
		{
			System.out.println("LCM OF  "+lcm);
			break;
		}
		lcm++;
	}

}
}
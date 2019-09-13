package numinolabs;

import java.util.Scanner;

public class numpalimdrome {

	public static void main(String args[])
	{
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int n=sc.nextInt();
	int rev=0;
	int remainder=0;
	int n1;
	n1=n;
	while(n!=0)
	{
		remainder=n%10;
		rev=rev*10+remainder;
		n/=10;
	}
if(rev==n1)
	{
		System.out.println(" is Palimdrome ");
		
	}
	else
	{
		System.out.println(" is not Palimdrome");
	}
	

}
}
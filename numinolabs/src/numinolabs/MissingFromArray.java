package numinolabs;

import java.util.Scanner;

public class MissingFromArray {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n[]= {1,2,3,4,6};
		int re=0;
		int sum=((n.length+1)*(n.length+2))/2;
		
		for(int i=0;i<=n.length-1;i++)
		{
           	sum-=n[i];		
		}
		System.out.println("Missing number is " +sum);
		
	     
		
	}
}

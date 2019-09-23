package CollectionsDemo;

import java.util.Scanner;

public class AverageOfIntegerByvalue {
	

	  private static Scanner sc=new Scanner(System.in);

		
	public static int[] displayInt(int n)
	{
		System.out.println("Enter the Integer");
		int val[]=new int[n];
		for(int i=0;i<val.length;i++)
		{
			val[i]=sc.nextInt();
		}
		return val;
		
	}
	
	public static double avg(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
		}
		return (double)sum/(double)a.length;
		
	}
	public static void main(String args[])
	{
		
		System.out.println("Average Of integer is - :  "+avg(displayInt(4)));
		
	}
}




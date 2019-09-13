package numinolabs;

import java.util.Scanner;

public class SmallestFrArray {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
		int n=sc.nextInt(); 
	    		
		int a[]=new int[n];
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=smallest)
			{
				smallest=a[i];
			}
			
		}
		System.out.println("Array Smallest elment is "+smallest);
		
}
}
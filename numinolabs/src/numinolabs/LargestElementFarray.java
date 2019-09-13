package numinolabs;

import java.util.Scanner;

public class LargestElementFarray {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
		int n=sc.nextInt(); 
	    int largest=1;
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=largest)
			{
				largest=a[i];
			}
			
		}
		System.out.println("Array Smallest elment is "+largest);
		
}
}


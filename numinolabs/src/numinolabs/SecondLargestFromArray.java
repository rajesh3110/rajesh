package numinolabs;

import java.util.Scanner;

public class SecondLargestFromArray {

	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try
	{
    System.out.println("Enter the size of Array :: ");
    
	int n=sc.nextInt();
    int array[]=new int[n];
    
    for(int i=0;i<n;i++)
    {
    	array[i]=sc.nextInt();
    }
    int temp;
	for(int i=0;i<n;i++) 
	{
		for(int j=i+1;j<n;j++)
		{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
		}
	}
	System.out.println("Second Largest Element "+array[n-2]);
	}
	catch(Exception e) 
	{
		 System.out.println(e);
	}
	
    
	
	
}
	 
}

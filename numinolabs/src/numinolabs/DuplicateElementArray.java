package numinolabs;

import java.util.Scanner;

public class DuplicateElementArray {
	

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int n=sc.nextInt();
    int array[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	array[i]=sc.nextInt();
    }
    int d=0;
    for(int i=0;i<n;i++)
    {
    	for(int j=i+1;j<n;j++)
    	{
    		if(array[i]==array[j])
    		{
    	       d=array[j];	
    		}
    	
    	}
    	
    }
    System.out.println("duplicate Element from the Array "+d);
	
	}
}
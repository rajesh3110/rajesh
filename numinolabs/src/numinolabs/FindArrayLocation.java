package numinolabs;

import java.util.Scanner;

public class FindArrayLocation {



	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter the Element - ");
			array[i]=sc.nextInt();
		}
		System.out.print("Enter the array element to find out ::");
        int n1=sc.nextInt();
        for(int j=0;j<array.length;j++)
        {
        	if(array[j]==n1)
        	{
        	  System.out.println("At "+j+" Location of element in array ");
        	  break;
        	}
        }
        
	}
	
}

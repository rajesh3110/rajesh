package numinolabs;

import java.util.Scanner;

public class AvgOfArray {
	
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int n=sc.nextInt();
	int array[]=new int[n];
	int count=0;
	int sum=0;
	for(int i=0;i<array.length;i++)
	{
		array[i]=sc.nextInt();
	    count++;
	    sum=sum+array[i];
	}
	int avg=sum/count;
	System.out.println("Average of Array is " + avg);

	

}
}

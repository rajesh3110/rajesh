package numinolabs;

import java.util.Scanner;

public class ReverseArrayElement {
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array : ");
	int n=sc.nextInt();
    int array[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	 array[i]=sc.nextInt();
    }
    for(int j=n-1;j>=0;j--)
    {
    	System.out.print(array[j]+" ");
    }

}
}

package numinolabs;

import java.util.Scanner;

public class AlterMerge {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of A and B array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=1;
		int n1=a.length;
		int n2=b.length;
		int k = 0; 
	
		
		int c[]=new int[n1+n2];
		for(int i=0;i<n1;i++)
		{
			System.out.println("Enter the element of A :: ");
			a[i]=sc.nextInt();
		
		}
		for(int i=0;i<n2;i++)
		{
			System.out.println("Enter the element of B :: ");
		     b[i]=sc.nextInt();
		
		}
		int i=0;int j=0;
		   while (i < n1 && j < n2) 
	        { 
	            c[k++] = a[i++]; 
	            c[k++] = b[j++]; 
	        } 
		   while (i < n1) 
	           c[k++] = a[i++];
		   while (i < n1) 
	            c[k++] = a[i++];
		   for (i = 0; i < n1 + n2; i++) 
		   {
	            System.out.print(c[i] + " "); 
		   }
}
}

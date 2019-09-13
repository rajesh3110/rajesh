package numinolabs;

import java.util.Scanner;

public class MergeArray {


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of A and B array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=1;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element of A :: ");
			a[i]=sc.nextInt();
		
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the element of B :: ");
		     b[i]=sc.nextInt();
		
		}
		for(int i=0;i<a.length;i++)
		{
	      c[i]=a[i];
	      count++;
		}
		for(int i=0;i<b.length;i++)
		{
	      c[count]=b[i];
	      
		}
		for(int i=0;i<c.length;i++)
		{
	      System.out.print(c[i]+" ");
	      
		}
		
	 
}

}



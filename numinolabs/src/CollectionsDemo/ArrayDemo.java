package CollectionsDemo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String args[])
	{
	
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of Array");
		  int s=sc.nextInt();
		  int in[]=new int[s];
		 for(int i=0;i<in.length;i++)
		  {
			  System.out.println("Enter the integer number:");
			  in[i]=sc.nextInt();
		  }
		  System.out.println("Integer Elements are --- ");
		  for(int p=0;p<in.length;p++)
		  {
			  System.out.print(in[p]+" ");
		  }
		  
		  //System.out.println(in.length);
		  
		  
		  
	double do1[]=new double[s];
		  for(int i=0;i<do1.length;i++)
		  {
			  System.out.println("Enter the double number:");
			  do1[i]=sc.nextInt();
		  } System.out.println("double Elements are --- ");
		  for(int p=0;p<do1.length;p++)
		  {
			  System.out.print(do1[p]+" ");
		  }
		 
		  
	 float f1[]=new float[s];
			  for(int i=0;i<f1.length;i++)
			  {
				  System.out.println("Enter the float number:");
				  f1[i]=sc.nextInt();
			  } System.out.println("Float Elements are --- ");
			  for(int p=0;p<f1.length;p++)
			  {
				  System.out.print(f1[p]+" ");
			  }
	long l1[]=new long[s];
	  for(int i=0;i<l1.length;i++)
		  {
		  System.out.println("Enter the  number:");
	  	  l1[i]=sc.nextInt();
	      } System.out.println("long Elements are --- ");
	  for(int p=0;p<l1.length;p++)
	     {
		  System.out.print(l1[p]+" ");
	      }
	   
 
	  
	
		  
		  
}
}
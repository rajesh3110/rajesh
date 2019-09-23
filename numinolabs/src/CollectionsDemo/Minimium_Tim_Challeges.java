package CollectionsDemo;

import java.util.*;

public class Minimium_Tim_Challeges {
	  private static Scanner sc=new Scanner(System.in);

	public static void main(String args[])
	{
	     System.out.println("Enter the size of Array: ");
	      int n=sc.nextInt();
		  int []resa=readInt(n);
		 System.out.println("Minimium_Value from the Array is = "+min(resa));
	}	  
		  private static int[] readInt(int n)
		  {
			int array[]=new int[n];  
		  
			  for(int i=0;i<array.length;i++)
			  {
				  
			      System.out.println("Enter the elment:");
				  array[i]=sc.nextInt();
			  }
			 return array; 
		  }
		  
		 private  static int min(int array[])
		  {
			  int min=Integer.MAX_VALUE;
			  for(int i=0;i<array.length;i++)
			  {
				  if(min>array[i])
					  min=array[i];
			  }
			  
			  return min;
			  
	     }
			
		  
		  
		  }
		  
		  
	      
	
	

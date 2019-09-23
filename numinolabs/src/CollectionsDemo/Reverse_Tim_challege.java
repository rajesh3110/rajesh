package CollectionsDemo;

import java.util.Scanner;

public class Reverse_Tim_challege {

	
	
	  private static Scanner sc=new Scanner(System.in);
	  
	  public static void main(String args[])
	  {
		  
		  
		  System.out.println("Enter the size of Array:");

		  int n=sc.nextInt();
		  int s[]=get(n);
		  System.out.println(reverse(s));
		  
	  }
	  
	  private static int []get(int n)
	  {
		  int a[]=new int[n];
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println("Enter the elements");
			  a[i]=sc.nextInt();
		  }
		  return a;
		  
	  }
	  
	  private static int []reverse(int a[])
	  {
	    int temp=0;
		  for(int i=a.length-1;i>0;i--)
		 {
	          temp=a[i];
		 }
		 return a;
		  
		  
	  }
	  
	  
	  
	  

}

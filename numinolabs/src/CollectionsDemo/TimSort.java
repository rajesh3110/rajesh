package CollectionsDemo;

import java.util.Scanner;

public class TimSort {

	public static void main(String args[])
	{
	
		  Scanner sc=new Scanner(System.in);
          int a[]= {20,3,203,232,23002};
          int sorted[]=new int[a.length];
		  for(int i=0;i<a.length;i++)
		  {
			  sorted[i]=a[i];
			  
		  }
		  int tem=0;
		  for(int i=0;i<sorted.length-1;i++)
		  {
			  if(sorted[i]<sorted[i+1])
			  {
				  tem=sorted[i];
				  sorted[i]=sorted[i+1];
				  sorted[i+1]=tem;
			  }
			  System.out.print(sorted[i]+" ");
		  }
		  
		  int pr[]= {230,2,230,102,22};
		  for(int i=1;i<pr.length;i++)
		  {
		  System.out.println(pr[i]);

		   }
		  
		  
		  int pr1[]= {230,2,230,102,22};
		  for(int i=0;i<pr1.length-1;i++)
		  {
		  System.out.println(pr1[i]);

		   }
}
}
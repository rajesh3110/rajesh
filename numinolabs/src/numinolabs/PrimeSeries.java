package numinolabs;

import java.util.Scanner;

public class PrimeSeries {
	
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
    int n=sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
    {
    	if(prime(i))
    	{
    		count++;
    	System.out.println("number "+i+" ");
    	}
    }
    
    
    
    

}
	public static boolean prime(int n)
	{
		if(n==1)
		{
			return false;
			
		}
	   for(int i=2;i<n/2;i++)
	   {
		   if(n%i==0)
		   {
			   return false;
		   }
		   
	   }
	   return true;
		
	}
	
}

package numinolabs;

import java.util.Scanner;

public class UdemyPrime {

	

	public static void main(String args[])
	{
		
 		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
       for(int i=10;i<=n;i++)
       {
    	   if(prime(i))
    	   {
    		   count++;
    		   System.out.println("Prime numbers "+" "+i);
    		   
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
     
     
     
	



	


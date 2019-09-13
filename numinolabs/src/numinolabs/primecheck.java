package numinolabs;

import java.util.Scanner;

public class primecheck {
	
	  Scanner sc=new Scanner(System.in);

	  void prime()
	  {
		   int p=0;
		   int m=sc.nextInt();
		   
		   for(int i=2;i<=m/2;i++)
		   {
			    if(m%i==0)
			    {
			    	System.out.println("not prime");
			    	p=1;
			    	break;
			    }
			   
		   }
		   if(p==0)
		    {
		    	System.out.println("prime");
		    }
	  }
	  
	  public static void main(String args[])
	  {
		  primecheck c=new primecheck();
		  System.out.println("Enter the number for the prime ");
		  c.prime();
	  }

}

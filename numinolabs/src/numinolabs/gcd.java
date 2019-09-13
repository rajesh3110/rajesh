package numinolabs;

import java.util.Scanner;

public class gcd {

	  Scanner sc=new Scanner(System.in);

	  void gcdfind()
	  {
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int gcd=0;
          for(int i=1;i<=a&&i<=b;i++)
          {
        	  if(b%i==0&&a%i==0)
        	  {
        		  gcd=i;
        	  }
        	  
          }
          System.out.println(gcd);
	  }
	  
	  public static void main(String args[])
	  {
		  gcd g=new gcd();
	      System.out.println("Enter the number for the GCD");
	      g.gcdfind();
	  }
}

package numinolabs;

import java.util.Scanner;

public class DividorOfNumber {

	
	
	public void show()
	{
		System.out.println("DividorOFnumber");
	}
	
	public static void main(String args[])
	{
	
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number ::");
		  //int n=sc.nextInt();
		  //int gcd=1;
		  String a=null;
		  System.out.println(a);
		  int n1=sc.nextInt();
		  for(int i=1;i<=n1;i++)
		  {
			  if(n1%i==0)
			  {
				  //gcd=i;
				  System.out.println("Dividorofnumber is "+i);

			  }
		  }
		  //System.out.println("Dividorofnumber is "+gcd);

		  
		  
	}
	
}

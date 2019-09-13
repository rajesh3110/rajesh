package numinolabs;

import java.util.Scanner;

public class factorial {

	  Scanner sc=new Scanner(System.in);

	
	void fact()
	  {
		  int f=1;
		  int n1=sc.nextInt();
		  for(int i=1;i<=n1;i++)
		  {
			  f=f*i;
		  }
		  			  System.out.println(f);

	  }
	
	public static void main(String args[])
	{
		factorial f=new factorial();
		System.out.println("Enter number for the factorial");

		f.fact();
	}
}

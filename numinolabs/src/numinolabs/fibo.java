package numinolabs;

import java.util.Scanner;

public class fibo{

	
	  Scanner sc=new Scanner(System.in);

	  
	  void fiboseries()
	  {
	  //int n=sc.nextInt();
	  int a=0;
	  int b=1;
	  int c=0;
	  int n=sc.nextInt();
	 System.out.print(a+" "+b);
	
	  for(int i=1;i<=n;i++)
	  {
		  c=a+b;
		  a=b;
		  b=c;
		  System.out.print(" " +c);
	  }
	  }
	  
	  
	  public static void main(String args[])
	  {
		  fibo f=new fibo();
		  System.out.println("Enter number for the Fibo Serires ");
		  f.fiboseries(); 
		 
	  }
}

package numinolabs;

import java.util.Scanner;

public class leapyear {
	  Scanner sc=new Scanner(System.in);
	  
	  void lyear()
	  {
		   int year=sc.nextInt();
		   if(year%4==0||year%100==0||year%400==0)
		   {
			   System.out.println(year+" is Leap Year");
		   }
		   else
		   {
			   System.out.println(year+ " not a Leap Year");

		   }
	  }
	  public static void main(String args[])
	  {
		  leapyear y=new leapyear();
		  System.out.println("Enter the year  ");
		  y.lyear();
	  }
}

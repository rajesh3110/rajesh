package numinolabs;

import java.util.Scanner;
import java.util.*;
public class AddOfFirstNLastDigit {
	
	
	protected void show()
	{
		System.out.println("DividorOFnumber");
	}
	public static void main(String args[])
	{
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the int ");

	  int n=sc.nextInt();
	  int firstdigit=0;
	  int lastdigit=0;
	  
	  
	  firstdigit=n;
	  while(firstdigit>=10)
	  {
		  firstdigit=firstdigit/10;
		  
	  }
	  lastdigit=n%10;
      System.out.println("first Digit "+firstdigit);
      System.out.println("last Digit "+lastdigit);

      System.out.println("Sum of digit "+(firstdigit+lastdigit));

}
}
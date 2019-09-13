package numinolabs;

import java.util.Scanner;

public class sumofDigit {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int n=sc.nextInt();
	int sumof=0;
	while(n>0)
	{
		sumof=sumof+n%10;
		n/=10;
	}
	
	System.out.println(sumof);
}

}
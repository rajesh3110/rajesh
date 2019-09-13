package numinolabs;

import java.util.Scanner;

public class VowelFromString {
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :: ");

	String string = sc.nextLine();
	System.out.println("Input String : "+string);
	string = string.replaceAll("[AaEeIiOoUu]", "");
	System.out.println(string);
	}
}
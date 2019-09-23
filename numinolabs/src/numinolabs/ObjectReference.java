package numinolabs;

import java.util.Scanner;

public class ObjectReference {

	
	public void ma(String ar)
	{
		
		System.out.println("ma is  method ::"+ar);
	}
	public static void main(String args[])
	{
		
		  Scanner sc=new Scanner(System.in);
		  int a=10;
		  int re=a++
				  + ++a;
		  System.out.println(re);
		  ObjectReference r1=new ObjectReference();
		  r1.ma("RAJESH");
		  ObjectReference r2=r1;
		  r2.ma("BHOSALE");


	
	
}
}

package numinolabs;
import java.util.*;
public class StaticDemo {
	
	
	String name;
	static String Clg_name="Wachand College Of Engineering Sangli ";
	int id;
	StaticDemo(String na,int n)
	{
		
		name=na;
		id=n;
	}
	static {
		System.out.println("Static Block ");
	}
	
	static {
		System.out.println("Static block 2");
	}
	void display()
	{
		
		System.out.println("Name Of Student is "+name+" with ID number "+id+" from College "+Clg_name);
		
	}
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   for(int i=1;i<3;i++)
	   {
	   System.out.println("Enter the rollnumber :");
       int n=sc.nextInt();
	   System.out.println("Enter the Name :");
	   String name=sc.next();
	   
	   StaticDemo d=new StaticDemo(name,n);
		d.display();
	   }
	}

}

package numinolabs;
import java.util.*;
public class ThisDemo {

	String fname;
	String lname;
	int p;
	void get(String n,String n1,int pid)
	{
		this.fname=n;
		this.lname=n1;
		this.p=pid;
	}
	/*ThisDemo()
	{
        System.out.println("constructor Calll::");		
	}*/
	void get()
	{
	   System.out.println("this:;");
	   
	}
	void set()
	{
		this.get();
		System.out.println(fname+" "+lname+ " "+p);
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the First name ");
		String n=sc.nextLine();
		System.out.println("Enter the Second name ");
	    String n1=sc.nextLine();
		System.out.println("Enter the PHone number :");
		int n2=sc.nextInt();
		ThisDemo d=new ThisDemo();
        d.get(n,n1, n2);
        d.set();
        //d.get(n, n1);
        //d.set();
		
	}
}

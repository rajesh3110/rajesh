package numinolabs;

import java.util.Scanner;

class Edureka_Inheritance1 {
	
	//Scanner sc=new Scanner(System.in);
		 String name;
		 private int pid;
		 int price;
		 protected void set(String n,int p,int p1)
		{
		 this.name=n;
		 this.pid=p;
		 this.price=p1;
			
		}
		protected void get()
		{
			System.out.println("Name - "+name);
			System.out.println("Id - "+pid);
			System.out.println("Price - "+price);


		}
		void s(int p)
		{
			this.pid=p;
		}
	    void g()
		{
			System.out.println(pid);
		}
}		
class Edureka_Inheritance
{
	public static void main(String args[])
	{
		
		Edureka_Inheritance1 r=new Edureka_Inheritance1();
	    r.set("BHOSALE", 10, 2000);
	    r.get();
	    System.out.println("___________________________");
	    System.out.println(r.name);
	    r.s(102);  // Access the Private Var from the another class;
	    r.g();
	    r.name="RAJESH";
	    System.out.println(r.name);
	    System.out.println(r.price);
	    //new Edureka_Inheritance1.get();
	       


 		
 		
 		

		
	}
	
	

}

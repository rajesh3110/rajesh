package numinolabs;

class Rajesh
{
	
	Rajesh()
	{
		System.out.println("parent constructor");
	}
	void m()
	{
    	System.out.println("parent method");

	}
	String favcolor="RED";
}
	

class bhosale extends Rajesh
{
	
	
	bhosale()
	{
	    super();	
		System.out.println("child Constructor");
	}
	String favcolor="BLACK";
    void m()
    {
     System.out.println("child method");

    }
	 
     
	void m1()
	{
  
	System.out.println("Variable "+favcolor);
	System.out.println("Variable as super "+super.favcolor);
	super.m();
	
    
}
	
	
}
public class SuperDemo {
	
	

	public static void main(String args[])
	{
       bhosale b=new bhosale();
       b.m1();
       
       
       

	
	
	
	}
}
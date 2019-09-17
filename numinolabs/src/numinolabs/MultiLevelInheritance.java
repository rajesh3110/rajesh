package numinolabs;

class Superclass
{
	
	void m()
	{
  	  System.out.println("Superclass");

	}
}

class subclass extends Superclass
{
      void m()
      {
    	  System.out.println("Subclass");
      }
}

class child extends subclass
{
	void m()
	{
  	  System.out.println("Child");
  }
   
}

public class MultiLevelInheritance {
	
	public static void main(String args[])
	{
	 Superclass s=new Superclass();
	 s.m();
	 subclass s1=new subclass();
	 s1.m();
	 child c=new child();
	 c.m();
	 	
	}

}

package numinolabs;


class Superclass
{
	
	void m3()
	{
  	  System.out.println("Superclass");

	}
}

class subclass extends Superclass
{
      void m1()
      {
    	  System.out.println("Subclass");
      }
}
class child extends Superclass
{
	void m2()
	{
  	  System.out.println("Child");
  }
   
}


public class HybridInheritance {
	
	public static void main(String arg[])
	{
		child sc=new child();
		sc.m2();
		sc.m3();
		
		
	}

}

package numinolabs;

class SuperClass {

	
	void m()
	{
		
		
		System.out.println("SuperClass::");
	}
	
public class SubClass extends SuperClass
	{
		void m()
		{
			System.out.println("SubClass::");
		}
		
	}
	
	
}
public class SingleInheritance
{
	
	public static void main(String args[])
	{
		SuperClass s=new SuperClass();
		s.m();
		
	}

}

package numinolabs;

class R
{
	int g()
	{
		return 0;
	}
	
	
}
class A extends R
{
	
	int g()
	{
		return 10;
	}
}

class B extends R
{
	int g()
	{
		return 3;
		
	}
}

class C extends R
{
	int get()
	{
		return 10;
	}
}



public class RuntimePoly {
	
	public static void main(String args[])
	{
		R r;
		r=new A();
		System.out.println(r.g());
		r=new B();
		System.out.println(r.g());
		r=new C();
		System.out.println(r.g());
		
		
		R r1=new A();
		System.out.println(r1.g());
		
		
	}
	

}

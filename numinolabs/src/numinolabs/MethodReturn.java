package numinolabs;

public class MethodReturn {
	
	
       float show(float a,float b)
        {
	       return a*b;
        }
	
	int show(int a,int b)
	{
	  return a+b;
	}
	public static void main(String args[])
	{
		
		MethodReturn n=new MethodReturn();
		
		int result=n.show(10,20);

		System.out.println(result);
	
		
		float result1=n.show(10,20);
		System.out.println(result1);
	}

}

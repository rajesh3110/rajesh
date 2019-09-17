package numinolabs;

public class SwapWithOut3Var {
	
	void swap(int a,int b)
	{
      System.out.println(a+" Before Swapping "+b);
		b=a+b;
		a=b-a;
		b=b-a;
        System.out.print("A" + "B" + 'A');  

      System.out.println(a+" After Swapping "+b);
	}
	
	public static void main(String args[])
	{
		

	SwapWithOut3Var v=new SwapWithOut3Var();
	  v.swap(10,20);

}
	}

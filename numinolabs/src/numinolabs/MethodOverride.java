package numinolabs;

class MethodOverride2 
{
	
	void show(int a,int b)
	{

		
		System.out.println(a+b+"Super Class");
	}
	
}	
class rajesh extends MethodOverride2
{
	 void show(int a,int b)
	 {
			System.out.println(a+b+"sub Class");

	 }

}


class MethodOverride
{
	
   public static void main(String args[])
     {
        MethodOverride2 r=new MethodOverride2();
        r.show(10,20);
        rajesh ra=new rajesh();
        ra.show(10,20);
	
 	
     }
}
 
package numinolabs;

/*final*/ class Final {

	
	    /*final*/ void m()
	    {
	    	System.out.println("G");
	    }
}
public class FinalDemo extends Final
{
    int va=320;

	
	
  void m()
  {
	  System.out.println("Ge");
  }
	public static void main(String args[])
	{
		Final d=new Final();
		d.m();
		
	}
 
}

package numinolabs;

public class MethodNoReturn {
	
	public void show(int i,int i2)
	{
		
		 System.out.println(i+i2+" NO REturn TYPE :::");
	}
	
	public void show(float i,float i2)
	{
		
		 System.out.println(i+i2+" NO REturn TYPE :::");
	}
	
	
	
	public static void main(String args[])
	{
		MethodNoReturn n=new MethodNoReturn();
		n.show(23,10);
		n.show(23f,10f);
		
		
	}

	

}

package numinolabs;

public class MethodOverloading {

    void show(float a,float b)
       {	
    	float r1=a+b;
	    System.out.println(r1+" FLoat Method over load 1");
	  }     
    void show(int a,int b)
		{
			int r2=a+b;
			System.out.println(r2+ " INT Method Over Load 2 ");
		}
		
	void show(double a,double b)
		{
			double r3=a+b;
			System.out.println(r3+ " Double Method over load 3");
			
		}	
	public static void main(String args[]){
		
		
		MethodOverloading b=new MethodOverloading();
		b.show(10f,20f);
		b.show(10,20);
		b.show(10d,20d);
		
	}

}
    	

	
 


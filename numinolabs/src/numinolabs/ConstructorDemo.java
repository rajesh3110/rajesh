package numinolabs;

class ConstructorDemo1 {
	
	int id;
	String name;
	protected ConstructorDemo1()
	{
		
		System.out.println("By Default the object is created using new keyword::: ");
	}
	
	 ConstructorDemo1(int n,float m)
	{
		
		System.out.println(n*m);
	}
	
    public ConstructorDemo1(int m1,int m2)//Constructor Overloading

    {
    	 
    	System.out.println(m1*m2);
    	
    }
	
    void show(int m)
    {
    	System.out.println(m*m);
    }
    
    
    ConstructorDemo1(int n,String s){  
        id = n;  
        name =s;  
        }  

    
    ConstructorDemo1(ConstructorDemo1 s){  
        id = s.id;  
        name =s.name;  
        }  
    
    void display()
    {
    	System.out.println(id+" "+name);
    }
}	
    
 class ConstructorDemo
  {
	public static void main(String args[])

	{
		ConstructorDemo1 m=new ConstructorDemo1(); 
		
		ConstructorDemo1 m1=new ConstructorDemo1(10,20.2f); //

		ConstructorDemo1 m2=new ConstructorDemo1(10,30);
        m2.show(100);
        
		ConstructorDemo1 t1=new ConstructorDemo1(100,"RAJESH"); 
		
		
		ConstructorDemo1 t2=new ConstructorDemo1(t1);
		t2.display();
		

        
		
	}
	
	
}
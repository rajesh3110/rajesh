package numinolabs;




public class UdemyR {
 
	
	private int x;
	private int y;
	private int w;
	private int l;
	
	public UdemyR()
	{
	this(0,0);	
	}
	
	public UdemyR(int w,int l)
	{
		this(0,0,w,l);
	}
	
	public UdemyR(int x,int y,int w,int l)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.l=l;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(w);
		System.out.println(l);



	}
	public static void main(String[] args) {
	
       UdemyR r=new UdemyR(1,2,3,4);
       System.out.println("-----------------------");
       UdemyR r1=new UdemyR(4,3,2,1);

       
       
       
		
		
	}

}

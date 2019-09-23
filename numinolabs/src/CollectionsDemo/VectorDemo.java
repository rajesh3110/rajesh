package CollectionsDemo;
import java.util.*;

public class VectorDemo {

	public static void main(String args[])
	{
	Vector<String>vv=new Vector<String>();
	vv.add("Rajesh");
	vv.add("dinesh");
	vv.add("Rakesh");
	vv.add("Mukesh");
	System.out.println(vv);
    Iterator it=vv.iterator();
    System.out.println("--------------------");
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
	System.out.println("--------------------");
	for(String s:vv)
	{
		System.out.println(s);
	}
    
	}
}

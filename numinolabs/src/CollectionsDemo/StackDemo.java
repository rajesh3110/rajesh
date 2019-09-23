package CollectionsDemo;
import java.util.*;
public class StackDemo {

	public static void main(String args[])
	{
	
	Stack<String>ss=new Stack<String>();
	ss.add("Rajesh");
	ss.add("dinesh");
	ss.add("Rakesh");
	ss.add("Mukesh");
	System.out.println(ss);
    Iterator it=ss.iterator();
    System.out.println("--------------------");
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
	System.out.println("--------------------");
	for(String s:ss)
	{
		System.out.println(s);
	}
    
	
}
}

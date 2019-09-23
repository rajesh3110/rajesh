package CollectionsDemo;
import java.util.*;

public class ArrayDemo1 {
	
   public static void main(String arhg[])
    {
  
	    ArrayList<String>arraylist=new ArrayList<String>();
       
	    arraylist.add("Rajesh");
	    arraylist.add("dinesh");
	    arraylist.add("Rakesh");
	    arraylist.add("Mukesh");
	    System.out.println(arraylist);
		System.out.println("--------------------");

	    Iterator it=arraylist.iterator();
	    while(it.hasNext())
	    {
	    		System.out.println(it.next());
	    }
	    
		System.out.println("--------------------");
		for(String s:arraylist)
		{
			System.out.println(s);
		}
	    
	    
	    
}
}
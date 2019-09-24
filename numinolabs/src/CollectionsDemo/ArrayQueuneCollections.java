package CollectionsDemo;

import java.util.Iterator;
import java.util.*;

public class ArrayQueuneCollections {
	
	
	public static void main(String args[])
	{
	ArrayDeque<String>Array=new ArrayDeque<String>();
	
	Array.add("Rajesh");
	Array.add("bhosale");
	Array.add("Rajesh");
	Array.add("dines");
	Array.add("manish");

	System.out.println(Array);
	
	
	System.out.println("---------------------");
	
	
	
	Iterator it=Array.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("---------------------");

    for(String ch:Array)
    {
    	System.out.println(ch);
    }


}
}



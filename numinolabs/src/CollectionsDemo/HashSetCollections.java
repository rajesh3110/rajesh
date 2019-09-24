package CollectionsDemo;

import java.util.*;
import java.util.Iterator;

public class HashSetCollections {


	public static void main(String args[])
	{
	HashSet<String>has=new HashSet<String>();
	
	has.add("Rajesh");
	has.add("bhosale");
	has.add("RaKesh");
	has.add("Dinesh");
	has.add("manish");

	System.out.println(has);
	
	
	System.out.println("---------------------");
	
	
	
	Iterator it=has.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("---------------------");

    for(String ch:has)
    {
    	System.out.println(ch);
    }


}
}




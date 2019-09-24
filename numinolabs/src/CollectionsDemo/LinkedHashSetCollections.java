package CollectionsDemo;

import java.util.*;

public class LinkedHashSetCollections {


	public static void main(String args[])
	{
	LinkedHashSet<String>lhs=new LinkedHashSet<String>();
	
	lhs.add("Rajesh");
	lhs.add("bhosale");
	lhs.add("RaKesh");
	lhs.add("Dinesh");
	lhs.add("manish");

	System.out.println(lhs);
	
	
	System.out.println("---------------------");
	
	
	
	Iterator it=lhs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("---------------------");

    for(String ch:lhs)
    {
    	System.out.println(ch);
    }


}
}



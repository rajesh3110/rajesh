package CollectionsDemo;

import java.util.*;
import java.util.Iterator;

public class TreeSetCollections {


	public static void main(String args[])
	{
	TreeSet<String>Tre=new TreeSet<String>();
	
	Tre.add("Rajesh");
	Tre.add("bhosale");
	Tre.add("sandesh");
	Tre.add("rakesh");
	Tre.add("abani");

	System.out.println(Tre);
	
	
	System.out.println("---------------------");
	
	
	
	Iterator it=Tre.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("---------------------");

    for(String ch:Tre)
    {
    	System.out.println(ch);
    }


}
}



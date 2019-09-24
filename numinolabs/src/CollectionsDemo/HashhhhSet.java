package CollectionsDemo;
import java.util.*;

public class HashhhhSet {

	
	public static void main(String args[])
	{
    
		HashSet<String>hss=new HashSet<String>();
		
	    hss.add("Rajesh");
		hss.add("dinesh");
		hss.add("Rakesh");
		hss.add("Mukesh");
		System.out.println(hss);
		System.out.println("--------------------");

		Iterator it=hss.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------------");

		for(String sr:hss)
		{
			System.out.println(sr);
		}
		
	}
}

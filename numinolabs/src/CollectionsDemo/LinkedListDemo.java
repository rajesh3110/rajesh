package CollectionsDemo;
import java.util.*;
public class LinkedListDemo {
	
	public static void main(String args[])
	{
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Rajesh");
		ll.add("dinesh");
		ll.add("Rakesh");
		ll.add("Mukesh");
		System.out.println(ll);
		System.out.println("--------------------");

		     Iterator it=ll.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());

				}
		System.out.println("--------------------");
		for(String s:ll)
		{
			System.out.println(s);
		}
		
	}

}

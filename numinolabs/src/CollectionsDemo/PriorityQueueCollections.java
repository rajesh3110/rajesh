package CollectionsDemo;
import java.util.*;
public class PriorityQueueCollections {
	
	public static void main(String args[])
	{
	PriorityQueue<String>priority=new PriorityQueue<String>();
	
	priority.add("Rajesh");
	priority.add("bhosale");
	priority.add("Rajesh");
	priority.add("dines");
	priority.add("manish");

	System.out.println(priority);
	
	
	System.out.println("---------------------");
	
	
	
	Iterator it=priority.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("---------------------");

    for(String ch:priority)
    {
    	System.out.println(ch);
    }


}
}
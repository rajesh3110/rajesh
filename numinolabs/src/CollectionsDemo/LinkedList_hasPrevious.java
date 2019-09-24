package CollectionsDemo;

import java.util.*;

public class LinkedList_hasPrevious {


	public static void main(String args[])
	{
    LinkedList<String>Llist=new LinkedList<String>();
    
     Llist.add("Mukesh");
     Llist.add("Dinesh");
     Llist.add("beema");
     Llist.add("ram");
	System.out.println("------Using normal --------------");
	for(String a:Llist)
	{
    System.out.println(a);
	}
	System.out.println("------lastIndexOf--------------");
	
	String r="Hello i m from numinolabs ";
	
	System.out.println("Last Index Of String "+r.lastIndexOf("s"));
	
	System.out.println("------get the specific element--------------");

	System.out.println(Llist.get(3));
	
	System.out.println("------set the specific element--------------");

	Llist.set(3,"Dhanu");
     for(String ree:Llist)
    
    	 {
    	 System.out.println(ree);
    	 }
     System.out.println("-------------insert at perticular Location--------------");
	Llist.add(0, "Rajesh");
	Llist.add(2, "Mau");
	for(String a:Llist)
	{
    System.out.println(a);
	}
	System.out.println("----------------addFirst---------------------------");
	Llist.addFirst("NETAJI");
	System.out.println(Llist);
	for(String a:Llist)
	{
    System.out.println(a);
	}
	System.out.println("------Using hasPrevious --------------");

	ListIterator<String> it=Llist.listIterator(Llist.size());
	while(it.hasPrevious())
	{
		String str=it.previous();
		System.out.println(str);
		
	}
	
	System.out.println("------Using using size() and get() --------------");

	for(int i=0;i<Llist.size();i++)
	{
		System.out.println(Llist.get(i));
	}
	
	System.out.println("------Using using Lambda Function --------------");
	
	Llist.forEach(a->{System.out.println(a);});

	
	
	System.out.println("------ Reverse Normal--------------");

	for(int i=Llist.size()-1;i>=0;i--)
	{
		System.out.println(Llist.get(i));
	}

	System.out.println("------ sort by collections --------------");
     
	Collections.sort(Llist);
	for(String a:Llist)
	{
    System.out.println(a);
	}
	
	System.out.println("------ Reverse by Reverse() --------------");
	
	Collections.reverse(Llist);
	for(String a:Llist)
	{
    System.out.println(a);
	}
	System.out.println("------ size()------------");
	System.out.println(Llist.size());
	
	System.out.println("----------------find out the elment present in ----------------");
	System.out.println(Llist.contains("beema"));
	
	
}
}

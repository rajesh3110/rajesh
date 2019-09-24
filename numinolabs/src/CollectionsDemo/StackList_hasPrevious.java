package CollectionsDemo;

import java.util.*;

public class StackList_hasPrevious {
	


	public static void main(String args[])
	{
    Stack<String>slist=new Stack<String>();
    
    slist.add("Mukesh");
    slist.add("Dheraj");
    slist.add("SRA");
    slist.add("RAKEJ");
    System.out.println("------Using normal --------------");
	for(String a:slist)
	{
    System.out.println(a);
	}
	System.out.println("------lastIndexOf--------------");
	
	String r="Hello i m from numinolabs ";
	
	System.out.println("Last Index Of String "+r.lastIndexOf("s"));
	
	System.out.println("------get the specific element--------------");

	System.out.println(slist.get(3));
	
	System.out.println("------set the specific element--------------");

	slist.set(3,"Dhanu");
     for(String ree:slist)
    
    	 {
    	  System.out.println(ree);
    	 }
     System.out.println("-------------insert at perticular Location--------------");
     slist.add(0, "Rajesh");
     slist.add(2, "Mau");
	for(String a:slist)
	{
    System.out.println(a);
	}
	System.out.println("------Using hasPrevious --------------");

	ListIterator<String> it=slist.listIterator(slist.size());
	while(it.hasPrevious())
	{
		String str=it.previous();
		System.out.println(str);
		
	}
	
	System.out.println("------Using display size() and get() --------------");

	for(int i=0;i<slist.size();i++)
	{
		System.out.println(slist.get(i));
	}
	
	System.out.println("------Using  Lambda Function --------------");
	
	slist.forEach(a->{System.out.println(a);});

	
	
	System.out.println("------ Reverse Normal --------------");

	for(int i=slist.size()-1;i>=0;i--)
	{
		System.out.println(slist.get(i));
	}
	
	

	System.out.println("------ sort by collections --------------");
     
	Collections.sort(slist);
	for(String a:slist)
	{
    System.out.println(a);
	}
	
	System.out.println("------ Reverse by Reverse() --------------");
	
	Collections.reverse(slist);
	for(String a:slist)
	{
    System.out.println(a);
	}
	System.out.println("------ size()------------");
	System.out.println(slist.size());
	
	System.out.println("----------------find out the elment present in ----------------");
	System.out.println(slist.contains("RAJESH"));
	
	
}
}


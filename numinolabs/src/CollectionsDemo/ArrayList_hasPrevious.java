package CollectionsDemo;

import java.util.*;

public class ArrayList_hasPrevious {
	
	
	public static void main(String args[])
	{
    ArrayList<String>arraylist=new ArrayList<String>();
    
    arraylist.add("Akshay");
    arraylist.add("Dinesh");
    arraylist.add("nita");
    arraylist.add("seeta");
	System.out.println("------Using normal --------------");
	for(String r:arraylist)
	{
	System.out.println(r);
	}
	
	System.out.println("------lastIndexOf--------------");
	
	String r="Hello i m from numinolabs ";
	
	System.out.println("Last Index Of String "+r.lastIndexOf("s"));
	
	System.out.println("------get the specific element--------------");

	System.out.println(arraylist.get(3));
	
	System.out.println("------set the specific element--------------");

     arraylist.set(3,"Dhanu");
     for(String ree:arraylist)
    
    	 {
    	 System.out.println(ree);
    	 }
	
	System.out.println("------Add at Perticular Index 0 and 2--------------");
    arraylist.add(0, "Rajesh");
    
    arraylist.add(2, "Mau");
    for(String ar:arraylist)
    {
    System.out.println(ar);
    }
	System.out.println("------Using hasPrevious --------------");

	ListIterator<String> it=arraylist.listIterator(arraylist.size());
	while(it.hasPrevious())
	{
		String str=it.previous();
		System.out.println(str);
		
	}
	
	System.out.println("------Using using size() and get() --------------");

	for(int i=0;i<arraylist.size();i++)
	{
		System.out.println(arraylist.get(i));
	}
	
	System.out.println("------Using using Lambda Function --------------");
	
	arraylist.forEach(a->{System.out.println(a);});

	
	
	System.out.println("------ Reverse Normal--------------");

	for(int i=arraylist.size()-1;i>=0;i--)
	{
		System.out.println(arraylist.get(i));
	}
	

	System.out.println("------ sort by collections --------------");
     
	Collections.sort(arraylist);
	for(String r11:arraylist)
	{
	System.out.println(r11);
	}
	
	System.out.println("------ Reverse by Reverse() --------------");
	
	Collections.reverse(arraylist);
	
	for(String r11:arraylist)
	{
	System.out.println(r11);
	}
	
	System.out.println("------Remove 3--------------");
	arraylist.remove(3);
	for(String r11:arraylist)
	{
	System.out.println(r11);
	}
	System.out.println("------ size()------------");
	System.out.println(arraylist.size());
	
	System.out.println("----------------find out the elment present in ----------------");
	System.out.println(arraylist.contains("RAJESH"));
}
}
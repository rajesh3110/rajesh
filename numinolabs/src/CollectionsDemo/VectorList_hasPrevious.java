package CollectionsDemo;
import java.util.*;

public class VectorList_hasPrevious {



	public static void main(String args[])
	{
		 Vector<String>Vlist=new Vector<String>();
		 Vlist.add("Mukesh");
		   Vlist.add("Dheraj");
		   Vlist.add("SRA");
		    Vlist.add("RAKEJ");	 
    
   
		    System.out.println("------Using normal --------------");
			for(String a:Vlist)
			{
		    System.out.println(a);
			}
			System.out.println("------lastIndexOf--------------");
			
			String r="Hello i m from numinolabs ";
			
			System.out.println("Last Index Of String "+r.lastIndexOf("s"));
			
			System.out.println("------get the specific element--------------");

			System.out.println(Vlist.get(3));
			
			System.out.println("------set the specific element--------------");

			Vlist.set(3,"Dhanu");
		     for(String ree:Vlist)
		    
		    	 {
		    	  System.out.println(ree);
		    	 }
		     System.out.println("-------------insert at perticular Location--------------");
		     Vlist.add(0, "Rajesh");
		     Vlist.add(2, "Mau");
			for(String a:Vlist)
			{
		    System.out.println(a);
			}
    
	System.out.println("------Using hasPrevious --------------");

	ListIterator<String> it=Vlist.listIterator(Vlist.size());
	while(it.hasPrevious())
	{
		String str=it.previous();
		System.out.println(str);
		
	}
	
	System.out.println("------Using using size() and get() --------------");

	for(int i=0;i<Vlist.size();i++)
	{
		System.out.println(Vlist.get(i));
	}
	
	System.out.println("------Using using Lambda Function --------------");
	
	Vlist.forEach(a->{System.out.println(a);});

	
	
	System.out.println("------ Reverse normal --------------");

	for(int i=Vlist.size()-1;i>=0;i--)
	{
		System.out.println(Vlist.get(i));
	}
	
	System.out.println("------ sort by collections --------------");
     
	Collections.sort(Vlist);
	for(String a:Vlist)
	{
    System.out.println(a);
	}
	
	System.out.println("------ Reverse by Reverse() --------------");
	
	Collections.reverse(Vlist);
	for(String a:Vlist)
	{
    System.out.println(a);
	}
	System.out.println("------ size()------------");
	System.out.println(Vlist.size());
	
	System.out.println("----------------find out the elment present in ----------------");
	System.out.println(Vlist.contains("Mukesh"));


	

}
}


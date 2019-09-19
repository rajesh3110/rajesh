package numinolabs;
import java.util.*;

public class SortStringWithCollection {
	

	
	
	/*private*/ void show()
	{
		System.out.println("DividorOFnumber");
	}
	
	
	public static void main(String args[])
	{
	
		

		
		  Scanner sc=new Scanner(System.in);
          System.out.println("Enter the count"); 
          int count=sc.nextInt();
          
          String s1[]=new String[count];
          
          
          for(int i=0;i<count;i++)
          {
        	  s1[i]=sc.next();
          }
          
          String temp="";
		  for(int i=0;i<count;i++)
		  {
			  for(int j=i+1;j<count;j++)
			  {
				if(s1[i].compareTo(s1[j])>0)
				  {
					  temp=s1[i];
					  s1[i]=s1[j];
					  s1[j]=temp;
					  
				  }
			  }
			  System.out.println(s1[i]);
			  
			  
		  }
		  
		  
}
}
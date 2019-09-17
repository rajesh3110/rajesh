package numinolabs;

import java.util.Scanner;

public class StringPalimdrome {

public static void main(String args[])
	
	{
    
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String ");
    String st=sc.next();
	  String rev="";
	  System.out.println();
	  for(int i=st.length()-1;i>=0;i--)
	  {
		  rev=rev+st.charAt(i);
		  
	  }
	  if(st.equals(rev))
	  {
		  System.out.println(st+ " String is Palimdrome");
		  
	  }
	  else
	  {
		  System.out.println(st + " String is not Palimdrome");
	  }
 
    
}
}
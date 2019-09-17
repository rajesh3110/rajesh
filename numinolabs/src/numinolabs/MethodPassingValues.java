package numinolabs;
import java.util.*;
public class MethodPassingValues {

        int n;
        String name;
	    String Lname;
	    int result;
	 
	  
	  public void getInfo()
	    {
		  Scanner sc=new Scanner(System.in);
		
 		     System.out.println("Enter the name of student :");
 		     name=sc.nextLine();
 		     System.out.println("Enter the Last name of student :");
 			 Lname=sc.nextLine();
 		     System.out.println("Enter the Marks of student :");
 		     n=sc.nextInt();
 		     
 		        
 	 
	    }
	  
	
	 void display()
	  {
		
        if(n>=85&&n<=95)
        {
  		  System.out.println(" Mr/Ms "+name+" "+Lname+" having the marks "+n+" with Grade is "+"AA");

        }
        else if(n>=75&&n<=85)
        {
    		  System.out.println(" Mr/Ms "+name+" "+Lname+" having the marks "+n+" with Grade is "+"BB");

        }
        else if(n>=65&&n<=75)
        {
  		  System.out.println(" Mr/Ms "+name+" "+Lname+" having the marks "+n+" with Grade is "+"CC");

        }
        else if(n>=55&&n<=65)
        {
  		  System.out.println(" Mr/Ms "+name+" "+Lname+" having the marks "+n+" with Grade is "+"DD");
	
        }
        else if (n>=45&&n<=55)
        {
        	System.out.println(" Mr/Ms "+name+" "+Lname+" having the marks "+n+" with Grade is "+"Need To Improve :");
        }
		  
        else
        {
        	System.out.println(" Mr/Ms "+name+" "+Lname+" having  marks "+n+" with Grade is "+"having lesss marks ");
        }
	  }
	  
	  
	
	  
	
	
	public static void main(String args[])
	{
		MethodPassingValues n=new MethodPassingValues();
		n.getInfo();
	    
	    n.display();
		
	
	
	  
	
	
		
	}

}


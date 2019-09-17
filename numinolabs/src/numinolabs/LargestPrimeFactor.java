package numinolabs;
import java.util.*;
public class LargestPrimeFactor {

	
	 public static void main(String[] args) 
	    {
	       Scanner sc=new Scanner(System.in);
	       try
	       {
	       //this is a large prime number 
	       int n=sc.nextInt(); 
	       int  i = 2;
	        int test = 0;

	        while (n > 1)
	        {
	            while (n % i == 0)
	            {
	                n /= i;     
	            }

	            i++;

	            if(i*i > n && n > 1) 
	            {
	                System.out.println(n); 
	                test = 1;
	                break;
	            }
	        }
	        
	        if (test == 0)  
	            System.out.println(i-1); 
	    }
	       
	       catch(Exception e)
	       {
	    	   System.out.println(e);
	       }
	      
}
}

package numinolabs;

import java.util.Scanner;

public class numreverse {

	
	  Scanner sc=new Scanner(System.in);
     void rev()
     {
    	 int rev=0;
    	 int remainder=0;
    	 int n=sc.nextInt();
    	 while(n!=0)
    	 {
    		remainder=n%10;
    		rev=rev*10+remainder;
    		n/=10;
    		
    		
    	 }
    	 System.out.println(rev);
     }
	  
	 public static void main(String args[])
	 {
		 numreverse r=new numreverse();
		 System.out.println("enter the number of for the reverses");
		 
		 r.rev();
	 }
}
		
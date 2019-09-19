package numinolabs;

import java.util.Scanner;
import java.util.*;
public class LambdaFunction {
	

	public static void main(String args[])
	{
	
		  Scanner sc=new Scanner(System.in);
		  
		  List<String>l=new ArrayList<String>();
		 
          l.add("RAJESH");
          l.add("BHOSALE");
          l.add("ARUNA");
          l.add("ARUdaNA");
          l.add("RaARa");
          l.add("Ba");
          l.add("BBaB");
          l.add("Ca");
          l.add("a");

          System.out.println("before sorting String----------------------");

          l.forEach(n->System.out.println(n));
	      //System.out.println("---------------------------------------------");

          Collections.sort(l,String.CASE_INSENSITIVE_ORDER);
          //l.remove("A");
          System.out.println("After sorting String----------------------");

          l.forEach(n->System.out.println(n));
         
	      //System.out.println("---------------------------------------------");

		  List<Integer>l1=new ArrayList<Integer>();
  
		  l1.add(126);
		  l1.add(102);

		  l1.add(202);

		  l1.add(232);
		  l1.add(123);

		  l1.add(22);

		  l1.add(2322);

		  l1.add(12);

          System.out.println("before sorting int ----------------------");

	      l1.forEach(n->System.out.println(n));

	      //System.out.println("---------------------------------------------");
	      Collections.sort(l1);
          System.out.println("After sorting int ----------------------");
	      l1.forEach(n->System.out.println(n));

		  
         
		   
		  
}
}
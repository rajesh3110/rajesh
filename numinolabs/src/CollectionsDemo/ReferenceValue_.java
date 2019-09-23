package CollectionsDemo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class ReferenceValue_ {

	
	public static void main(String args[])
	{
	
		  Scanner sc=new Scanner(System.in);
	      int variable1=10;
	      int variable2=variable1;
	      System.out.println("Before change "+variable1);
	      System.out.println("Before change "+variable2);
        
	      variable2++;
	      
	      System.out.println("After change "+variable1);
	      System.out.println("After change "+variable2);
        
	      
	      
	      int firstarray[]=new int[5];
	      int secondarray[]=firstarray;
	      System.out.println("Before change "+Arrays.toString(firstarray));
	      System.out.println("Before change "+Arrays.toString(secondarray));
	      
          secondarray[2]=7;
          firstarray[1]=9;
          firstarray[0]=21;
          System.out.println("after change "+Arrays.toString(firstarray));
	      System.out.println("after change "+Arrays.toString(secondarray));
	      
	      
	
}
}
package numinolabs;
import java.util.*;

public class SortbyCollections {
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int a=10,b=0,c=0;
				
		System.out.println(a+" "+b+" "+c);
		System.out.println("Enter the size of Array :");
		int n=sc.nextInt();
	   
	    int array[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
            System.out.println("Enter the elements :: ");
	    	array[i]=sc.nextInt();
	    }

	    System.out.println("unsorted elements :: ");

	    for(int i:array)
	   {
	    System.out.print(i+" ");
	   }
	    System.out.println("Sorted Elements :: ");

	   Arrays.sort(array);
	   

	    for(int i:array)
		   {
		    System.out.print(i+" ");
		   }
	   
	   
}
}


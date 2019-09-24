package CollectionsDemo;

import java.util.*;

public class UserInputInArrayList {

	
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
    
    
    ArrayList m=new ArrayList();
    System.out.println("Enter the size of ArrayList :");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	System.out.println("Enter the ArrayList Elements :");
   	 m.add(sc.nextInt());
   	 
    }
    System.out.println("Sorted Elements: ");
    Collections.sort(m);
    System.out.println(m);
    
    
    System.out.println("Reverse Elements : ");
    Collections.reverse(m);
    System.out.println(m);

    
    
    
    
}
}
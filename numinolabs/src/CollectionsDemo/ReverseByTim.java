package CollectionsDemo;

import java.util.*;

public class ReverseByTim {

	
	
	public static void main(String arg[])
	{
	int array[]= {10,23,30232,320,3,320,23};
	System.out.println("Original"+Arrays.toString(array));

	reverse(array);
	System.out.println("Reverse"+Arrays.toString(array));
		
	}
	
	private static void reverse(int array[])
	{
		int maxindex=array.length-1;
		int halfindex=array.length/2;
		for(int i=0;i<halfindex;i++)
		{
			int temp=array[i];
			array[i]=array[maxindex-i];
			array[maxindex-i]=temp;
		}
		
		
	}
	
}

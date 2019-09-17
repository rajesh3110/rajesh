package numinolabs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchCollections {

	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	   int array[]= {20,302,302,32,07,43};
	   
	   Arrays.sort(array);
	   
	   int key=sc.nextInt();
	   int result=Arrays.binarySearch(array,key);
	  

		   System.out.println(key+" "+"found at "+result);
	   
	   
	
}
}

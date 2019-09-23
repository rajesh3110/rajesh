package CollectionsDemo;

import java.util.Scanner;

public class ArrayDemoByValues {

	  private static Scanner sc=new Scanner(System.in);

	
	public static int[] displayInt(int n)
	{
		System.out.println("Enter the Integer");
		int val[]=new int[n];
		for(int i=0;i<val.length;i++)
		{
			val[i]=sc.nextInt();
		}
		return val;
		
	}
	public static long[]displaylong(long w1)
	{
		System.out.println("Enter the Long");
		long lo[]=new long[(int)w1];
		for(int i=0;i<lo.length;i++)
		{
			lo[i]=sc.nextInt();
		}
		return lo;
	}
	public static float[]displayfloat(float wr)
	{
		System.out.println("Enter the Float");
		float lo1[]=new float[(int)wr];
		for(int i=0;i<lo1.length;i++)
		{
			lo1[i]=sc.nextInt();
		}
		
		return lo1;
	}
	
	
	
	public static void main(String args[])
	{
	
		  int r[]=displayInt(4);
		  System.out.println("Integer Elements ::");
		  for(int i=0;i<r.length;i++)
		  {
			  System.out.println(r[i]+" ");
		  }
		  

		  long r1[]=displaylong(4l);
		  System.out.println("long Elements ::");
		  for(int i=0;i<r1.length;i++)
		  {
			  System.out.println(r[i]+" ");
		  }
	      float rtt[]=displayfloat(4f);
	      System.out.println("float Elements ::");
	      for(int i=0;i<rtt.length;i++)
		  {
			  System.out.println(r[i]+" ");
		  }
}
}
package CollectionsDemo;
import java.util.*;
public class Tim_Challege {

	private static Scanner sc=new Scanner(System.in);
	public static int[] getArrayElement(int n)
	{
		int r[]=new int[n];
		for(int j=0;j<r.length;j++)
		{
			System.out.println("Enter the elements: ");
			r[j]=sc.nextInt();
		}
		return r;
		
	}
	public static int[]display(int r[])
	{
		int temp=0;
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r.length;j++)
			{
				if(r[i]>r[j])
				{
					temp=r[i];
					r[i]=r[j];
					r[j]=temp;
				}
			}
		}
		return r;
	}
public static void main(String args[])
{

	 System.out.println("Elements + "+display(getArrayElement(4)));
}
	
}

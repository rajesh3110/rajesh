package CollectionsDemo;
import java.util.*;

public class SortArrayusingcallbyvalue {
	
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int temp=0;
	void get(int n)
	{	
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	
		
	}
	void sort()
	{
	
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
    }
	public static void main(String args[])
	{
	
		SortArrayusingcallbyvalue r=new SortArrayusingcallbyvalue();
		r.get(4);
		r.sort();

		
	}

}

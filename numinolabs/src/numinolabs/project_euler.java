package numinolabs;

public class project_euler {

	public static void main(String args[])
	{
		int array[]=new int[100];
		int sum=0;
		for(int i=1;i<1000;i++)
		{
			 if(i%3==0||i%5==0)
			 {
				 sum=sum+i;
			 }
			 
		}
		System.out.println(sum);
	}
	 
}

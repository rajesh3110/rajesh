package numinolabs;
import java.util.*;
public class project_euler2 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0;
		int fibsum=0;
		for(int i=1;i<=4;i++)
		{
			c=a+b;
            a=b;
			b=c;
		   fibsum=fibsum+b;
          
			System.out.println(c);
		}
		System.out.println(fibsum);
		
	}
	
}

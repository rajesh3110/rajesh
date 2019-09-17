
package numinolabs;
import java.util.*;
public class SpeeedConverter {

	
	public static void main(String args[])
	{
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Km");
	int km=sc.nextInt();
	
	
	int mm=km*1000;
	
	System.out.println(km+" is converted to MM is "+mm);
    
	km=mm/1000;
	System.out.println(mm+"is converted to Km is "+km);

	
	
	
	
	
	
}
}
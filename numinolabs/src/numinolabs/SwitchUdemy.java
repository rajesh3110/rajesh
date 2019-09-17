package numinolabs;
import java.util.*;
public class SwitchUdemy {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice :");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Press 1 ");
		    break;
		case 2:
			System.out.println("Press 2 ");
            break;
		case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:
		    System.out.println("Presss "+choice);
		    break;
		 default:
			  System.out.println("Error");
		
		}
		
		
		
	}
	
	
}

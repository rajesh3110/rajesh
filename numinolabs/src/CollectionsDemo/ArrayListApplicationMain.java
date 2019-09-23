package CollectionsDemo;
import java.util.*;
public class ArrayListApplicationMain {
	
	
	private static Scanner sc=new Scanner(System.in);
	private static Gro glist=new Gro();

	
	public static void main(String args[])
	{
		boolean quit=false;
		int choice=	0;
		printInstruction();
		while(!quit)
		{
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				printInstruction();
				break;
			case 1:
				   printInstruction();
				  break;
			case 2:
			     additem();
			     break;
			case 3:
				modifyitem();
				break;
			case 4:
				removeitem();
				break;
			case 5:
				searchitem();
				break;
			case 6:
				quit=true;
			   break;
			   
			}
			
			
			
		}
		
		
	}
	
	public static void printInstruction()
	{
		System.out.println("\nPress");
		System.out.println("\t 0 To print option list  :");
		System.out.println("\n 1 To print grocessor Item:");

		System.out.println("\n 2 Add the item to list :");

		System.out.println("\n 3 To modify the list  ");

		System.out.println("\n 4 To remove the element from the list");

		System.out.println("\n 5 To Search the element from the list ");
		System.out.println("\n 6 Quit ");


	}
	
	public static void additem()
	{
		System.out.println("Enter the element in list: ");
		glist.addGroceryItem(sc.nextLine());
		
	}
	
	public static void modifyitem()
	{
		System.out.println("Enter item number ");
		int ite=sc.nextInt();
		System.out.println("Enter item replacement item:");
		String rn=sc.nextLine();
		glist.modifyGroceryItem(ite-1,rn);
	}
	public static void removeitem()
	{
		System.out.println("Enter item number ");
		int itemno=sc.nextInt();
		glist.remoceGroceryItem(itemno);
	}
	
	public static void searchitem()
	{
		System.out.println("Enter item number ");
		String se=sc.nextLine();
		glist.searchGroceryItem(se);
	}
}

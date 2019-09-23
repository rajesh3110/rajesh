package CollectionsDemo;
import java.util.*;

public class Gro {

   private ArrayList<String> groclist=new ArrayList<String>();
    
	public void addGroceryItem(String item)
	{
		groclist.add(item);
	}
	
	public void printGroceryItem()
	{
		
		System.out.println("you have "+groclist.size()+" item in your grocery list");
		for(int i=0;i<groclist.size();i++)
		{
			System.out.println((i+1)+" ."+groclist.get(i));
		}
	}
	
	public void modifyGroceryItem(int position,String name)
	{
		groclist.set(position,name);
		System.out.println("Grocessry item "+(position+1)+"modified");
	}
	
	public void remoceGroceryItem(int position)
	{
		String na=groclist.get(position);
		groclist.remove(position);
	}
	public String searchGroceryItem(String search)
	
	{
	int position=groclist.indexOf(search);
    if(position>=0)
    	
		{
		
    	return groclist.get(position);
			}
       return null;
	}
	
	
}

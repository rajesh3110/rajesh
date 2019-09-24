package CollectionsDemo;
import java.util.*;
public class Autoboxing_unboxing {
	
	
	public static void main(String a[])
	{
	     Scanner sc=new Scanner(System.in);
	
	String StringArray[]=new String[10];
 	int intArray[]=new int[10];
    System.out.println(StringArray);
    System.out.println(intArray);
    System.out.println(StringArray.length);
    System.out.println(intArray.length);
    
    ArrayList n=new ArrayList();
    n.add("RAjesh");
    n.add(232);
    n.add(4.3);
    n.add(true);
    Iterator it=n.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    
    ArrayList<String>StringList=new ArrayList<String>();
    
    StringList.add("RAJESH");
    StringList.add("R");
    StringList.add("RAJEdfa");
    System.out.println(StringList.size());
    //ArrayList<int>intList=new ArrayList<String>();
    
    HashSet<Integer>intList=new HashSet<Integer>();
     intList.add(10);
     intList.add(1220);
     System.out.println( intList);
   
     

   ArrayList<Integer>arl=new ArrayList<Integer>();
    
     //System.out.println("Enter the number :");
     //int s=sc.nextInt();
     for(int i=0;i<=10;i++)
     {
    	 arl.add(Integer.valueOf(i));
     }
   for(int i=0;i<=10;i++)
   {
	   System.out.println(i+"----->"+arl.get(i).intValue());
   }
   Integer myinteger=12323;
   int nr=myinteger.intValue();
   System.out.println(nr);

}
}
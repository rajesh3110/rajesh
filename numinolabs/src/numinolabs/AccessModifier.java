package numinolabs;
import java.util.*;

public class AccessModifier {
	
	public void show() {
		
		System.out.println("Public Access Modifier");
	}
	
	 void s1()
	{
		
		System.out.println("Default");
	}
	
	 protected void s2()
	 {
		 System.out.println("Protected Access Modifier");
	 }
	 
	 
private class r extends AccessModifier
{
	
	public void show() {
		
		System.out.println("Public Access Modifier");
	}
	
	 void s1()
	{
		
		System.out.println("Default");
	}
	
	 protected void s2()
	 {
		 System.out.println("Protected Access Modifier");
	 }
	 
}

protected class B extends r
{
	public void show() {
		
		System.out.println("Public Access Modifier");
	}
	
	 void s1()
	{
		
		System.out.println("Default");
	}
	
	 protected void s2()
	 {
		 System.out.println("Protected Access Modifier");
	 }
}
	public static void main(String args[])
	{
	
		AccessModifier n=new AccessModifier();
        n.show();
        n.s1();
        n.s2();

		//r r1=new r();
        //r.show();
		
		
		
}
}
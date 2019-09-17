package numinolabs;

public class RecursionFact {

	int Fact(int n)
	{
		
		if(n>=1)
			return n*Fact(n-1);
		else
			return 1;
	}
	
	public static void main(String args[])
	{
		RecursionFact n=new RecursionFact();
		int resu=n.Fact(6);
	    System.out.println(resu);
	}

}

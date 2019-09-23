package numinolabs;

public class Main {

	
	private int tonerlevel;
    private int pagesprinted;
    private boolean dupelx;

	public Main(int tonerlevel,boolean dupelx)
	{
		if(tonerlevel>=1&&tonerlevel<=100)
		{
			this.tonerlevel=tonerlevel;

		}
		else
		{
			this.tonerlevel=-1;
		}
		
		
		this.tonerlevel=tonerlevel;
		this.dupelx=dupelx;
		this.pagesprinted=0;
	}
	public int get(int toneramount)
	{
		if(toneramount>0&&toneramount<=100)
		{
			if(this.tonerlevel+toneramount>100)
			{
				return -1;
			}
			this.tonerlevel +=toneramount;
			return this.tonerlevel;
		}
		else
		{
			return -1;
		}
	
	
	}
	
	public int printingpages(int pages)
	{
     int printTopage=pages;
     if(this.dupelx) 
     {
    	 printTopage/=2;
    	 System.out.println("printing pages in dupex mood");
     }
     
     this.pagesprinted+=printTopage;
     return printTopage; 
	}

	public int pr()
	{
		return pagesprinted;
	}
	
	
	
}


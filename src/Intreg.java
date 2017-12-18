
public class Intreg extends Tip
{
	private int nr;
	
	public Intreg(int nr)
	{
		this.nr = nr;
	}
	
	public String getTip()
	{
		return "Tip intreg";
	}
	
	public String toString()
	{
		return "" + nr;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Intreg)
		{
			Intreg numar = (Intreg)o;
			return nr==numar.nr;
		}
		else return false;
	}
}


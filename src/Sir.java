
public class Sir extends Tip
{
	private String sir;
	
	public Sir(String sir)
	{
		this.sir = sir;
	}
	
	public String getTip()
	{
		return "Tip String;";
	}
	
	public String toString()
	{
		return sir;
	}
	
	
	public boolean equals(Object o)
	{
		if(o instanceof Intreg)
		{
			Sir text = (Sir)o;
			return sir.equals(text.sir);
		}
		else return false;
	}
}


import java.util.ArrayList;
import java.util.Iterator;


public class Colectie extends Tip
{
	private ArrayList<Tip> myList = new ArrayList<Tip>();
	
	public void add(Tip element)
	{
		myList.add(element);
	}
	
	public boolean equals(Object ob)
	{	
		if(ob instanceof Colectie)
		{
			return myList.equals(((Colectie)ob).myList);
		}	
		return false;
	}
	
	public String getTip()
	{
		String tipuri="";
		
		Iterator<Tip> myListIterator = myList.iterator();
		
		while (myListIterator.hasNext()) 
		{
			//System.out.println(myListIterator.next());
			tipuri += myListIterator.next().getTip() + " ";
		}
		
		/*
		for(int i = 0; i < myList.size(); i++)
		{
			tipuri += myList.get(i).getTip() + " ";
		}
		*/
		
		return tipuri;
	}
	
	
	
	
	public String toString()
	{
		String elemente = "(";
		
		Iterator<Tip> myListIterator = myList.iterator();
		
		while (myListIterator.hasNext()) 
		{
			//System.out.println(myListIterator.next());
			//if(myListIterator.hasNext())
				elemente += myListIterator.next();
				if(myListIterator.hasNext())
					elemente +=  ", ";
				
			
			//else elemente += myListIterator.next() + ", ";
		}
		
		/*
		for(int i = 0; i < myList.size(); i++)
		{
			elemente += myList.get(i) + " ";
		}
		*/
		
		elemente += ")\n" + getTip();
		
		return elemente;
		
	}
	
}

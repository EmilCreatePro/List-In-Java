
public class Main 
{

	public static void main(String[] args) 
	{
		Intreg i1 = new Intreg(2);
		Intreg i2 = new Intreg(3);
		Intreg i3 = new Intreg(4);
		
		/*
		Intreg i4 = new Intreg(2);
		Intreg i5 = new Intreg(3);
		Intreg i6 = new Intreg(4);
		*/
		
		Intreg i4 = new Intreg(5);
		Intreg i5 = new Intreg(6);
		Intreg i6 = new Intreg(7);
		
		Sir s1 = new Sir("babadok");
		Sir s2 = new Sir("Salut");
		
		Sir s3 = new Sir("polala");
		Sir s4 = new Sir("amamma");
		
		Colectie c1 = new Colectie();
		Colectie c2 = new Colectie();
		
		c1.add(i1);
		c1.add(i2);
		c1.add(i3);
		c1.add(s1);
		c1.add(s2);
		
		c2.add(i4);
		c2.add(i5);
		c2.add(i6);
		c2.add(s3);
		c2.add(s4);
		
		System.out.println("List1 = " + c1);
		System.out.println("\nList2 = " + c2);
		
		System.out.println(c1.equals(c2));
		
		
	}

}

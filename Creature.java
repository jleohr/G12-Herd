//© A+ Computer Science
// www.apluscompsci.com

//ArrayList of User-defined Classes


public class Creature
{
	private int size;

	public Creature(int girth) {
		size=girth;
	}

	public void setSize(int girth)
	{
		size=girth;
	}

	/*
	 * method isBig should return true if size > 75
	 * method isBig should return false if size <= 75
	*/
	public boolean isBig()
	{
		return false;
	}

	public boolean equals(Object obj)
	{

		return false;
	}

	public int compareTo(Object obj)
	{

		return 0;
	}

	public String toString() {
		return "" + size;
	}
}
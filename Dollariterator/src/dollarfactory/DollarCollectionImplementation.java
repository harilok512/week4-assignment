package dollarfactory;

public class DollarCollectionImplementation implements DollarCollection 
{
private String[] dollar= {"Dollars are available in $1, $2, $5, $10, $20, $50, and $100 notes.",
						  "Dollars are made of 75 percent cotton and 25 percent linen",
						  "Dolloar notes are available in Beige,Blue,Green,Pink,Yellow and goldenrod orange colors"
						 };
	@Override
	public Iterator getIterator() {
		return new DollarIteratorImplementation();
	}
	
	private class DollarIteratorImplementation implements Iterator
	{
		int j=0;

		@Override
		public boolean hasNext() {
			if(j<dollar.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return dollar[j++];
			else
				return null;
		}
		
	}

}

package dollarfactory;

public class DollarFactoryTest 
{

	public static void main(String[] args) 
	{
		DollarCollectionImplementation dollar = new DollarCollectionImplementation();
		Iterator i = dollar.getIterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println((String)o);
		}

	}

}

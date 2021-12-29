//This program creates a custom exception type.
class Myexception extends Exception
{
	private int detail;
	Myexception(int a)
	{
		detail = a;
	}
	public String toString()
	{
		return "Myexception["+detail+"]";
	}
}
class Customexception
{
	static void compute(int a) throws Myexception
	{
		System.out.println("Called compute("+a+")");
		if(a>10)
			throw new Myexception(a);
		System.out.println("Normal exit");
	}
	public static void main(String args[])
	{
		try
		{
			compute(1);
			compute(20);
		}
		catch(Myexception e)
		{
			System.out.println("caught" + e);
		}
	}
}
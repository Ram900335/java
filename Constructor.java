public class Constructor
{
	// create a class attribute
	int x;
	
	// create a class constructor for the classname
	public Constructor()
	{
		x=4;//set the initial value for the class attribute x
	}
	
	public static void main(String[] args)
	{
		Constructor myobj = new Constructor();
		//classname (this)
		System.out.println(myobj.x);
	}
}

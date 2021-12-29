/*here, box uses a parameterized constructor to intialize to dimensions of a box.*/
class Box
{
	double width;
	double height;
	double depth;

	// this is the constructor for box.
	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	// compute and return volume 
	double volume()
	{
		return width * height * depth;
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
		//declare, allocate, and initialize box objects
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);

		double vol;

		//get volume if first box
		vol = mybox1.volume();
		System.out.println("volume is" + vol);

		//get volume of second box
		vol = mybox2.volume();
		System.out.println("volume is "+ vol);
	}
}

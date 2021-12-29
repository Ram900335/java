public class Car
{
	public void fullThrottle()
	{
		System.out.println("my car is going full speed");
	}
	
	public void speed(int maxspeed)
	{
		System.out.println("speed=" +maxspeed);
    }
	
	public static void main(String[] args)
	{
		Car myobj=new Car();
		myobj.fullThrottle();
		myobj.speed(88);
	}
}
public class TestThreadTwice1 extends Thread
{
	public void run()
	{
		System.out.println("runing");
	}
	public static void main(String argsp[])
	{
		TestThreadTwice1 t1 = new TestThreadTwice1();
		t1.start();
		t1.start();
	}
}
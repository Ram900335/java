//example of sleep method in java
class TestSleepMethod1 extends Thread
{
	public void run()
	{
		for (int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(1500);
			}
			catch(InterruptedException e)
			{
				System.out.print(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		
		t1.start();
		t2.start();
	}
}
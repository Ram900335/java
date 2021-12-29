
import java.util.Random;

class Thread1 extends Thread
{
	Random R;
	String name;
	int num;
	
	Thread1(String name)
	{
		this.name = name;
		R = new Random();
		start();
	}

   public void run()
   {
   		System.out.println("Starting "+name);
   		int i;

    	for(i = 0; i <= 100; i++)
    	{	
    		num = R.nextInt(100) + 1;
    		if(num < 90)
    		{
				System.out.println(name+" : "+num);
				try
				{
					Thread.sleep(4000);
				}
				catch(Exception es)
				{
					System.out.println("Exception caught"+es);
				}	
			}
			else break;
		}
		System.out.println("Number of values printed by "+name+" "+i);
    }
}

class ExtendThread{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("thread1");
		Thread1 t2 = new Thread1("thread2");
		Thread1 t3 = new Thread1("thread3");
		Thread1 t4 = new Thread1("thread4");
		try
		{
			t1.join();t2.join();t3.join();t4.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println("Exception caught"+ex);
		}

		System.out.println("Exiting Main");
	}
}

//create a second thread.

class NewThread implements Runnable
{
	Thread t;
	
	NewThread()
	{
		//create a new , second thread
		t = new Thread (this,"demo Thread");
		System.out.println("child thread:" +t);
		t.start(); // start the thread
	}
	// this is the entry point for the second thread
	public void run()
	{
		try
		{
			for(int i = 5; i > 0; i--)
			{
				System.out.println("child Thread:" +i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e)
		{
			Ststem.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread.");
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		new NewThread(); //create a new thread
		
		try{
			for(int i = 5;i>0;i--);
			System.out.println("main Thread:"+i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e)
	{
		System.out.prinln("main thread exiting"+e);
	}
}
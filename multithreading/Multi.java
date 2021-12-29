class Multi implements Runnable
{	
	public static void main(String args[])
	{
		Multi t1 = new Multi();
		Thread thread = new Thread(t1);
	    thread.start();
	}
	
	public void run()
	{
	    for(int i = 0; i < 5; i++)
	    {
	        try
	        {
	            thread.sleep(1000);
	        }
	        catch(InterruptedException e)
	        {
	            System.out.println(e);
	        }
	        System.out.println(i);
	    }
	}
}

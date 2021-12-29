import java.io.*;
import java.awt.*;
import java.applet.Applet;
import java.util.*;

public class Clock extends Applet implements Runnable
{
	Thread runner;

	public void init()

	{

	}

	public void start()
	{
		if(runner == null)
		{
			runner = new Thread(this);
			runner.start();
		}
	}
	public void stop()
	{
		if(runner!=null)
		{
			runner=null;
		}
	}
	public void run()
	{
		Thread thisthread=Thread.currentThread();
		while (runner==thisthread)
		{
			repaint();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		}
	}
	public void paint(Graphics screen)
	{
		Date hello=new Date();
		screen.setFont(new Font("serif",Font.BOLD+Font.ITALIC,24));
		screen.drawString(hello.toString(),50,50);

	}
}
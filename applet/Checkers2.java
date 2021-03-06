import java.awt.Graphics;
import java.awt.Color;
public class Checkers2 extends Applet implements Runable
{
	Thread runner;
	int xpos;
	int ux1,ux2;
	
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
		if(runner != null)
		{
			runner.stop;
			runner = null;
		}
	}
	public void run()
	{
		setBackground(Color.blue);
		while(true)
		{
			for(xpos = 5; xpos <= 105, xpos+=4)
			{
				if (xpos == 5) ux2 = size().width;
				else ux2 = xpos + 90;
				repaint();
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException e)
				{}
				if (ux1 == 0 ) ux1 = xpos;
			}
			xpos = 5;
		}
	}
	public void update(Graphics g)
	{
		g.clipRect(ux1, 5, ux2 - ux1,95);
		paint(g);
	}
	public void paint(Graphics g)
	{
		//draw background
		g.setColor(Color.black);
		g.fillRect(0, 0, 100, 100);
		g.setColor(Color.white);
		g.fillRect(101, 0, 100, 100);
		
		// draw checker
		g.setcolor(Color.red);
		g.fillOval(xpos, 5, 90, 90);
		
		//reset the drawing area
		ux1 = ux2 = 0;
	}
}
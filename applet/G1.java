import java.applet.*;
import java.awt.*;
import java.lang.*;
/*<applet code="G1" width=700 height=300>
</applet>*/
public class G1 extends Applet
{
	int x; int y; int w;

	void sleep()
	{
		try
		{
			Thread.sleep(200);
		}
		catch(Exception ex){}
	}
	public void init()
	{
		x = 20;
		y = 30;
	}
	public void paint(Graphics g)
	{
		SetBackground(Color.cyan);
		w = getwidth();
		Color c1 = new Color (20,160,200);
		Color c2 = new Color(200,60,200);
		g.setcolor(c1);
		g.drawLine(0,y+75,w,y+75);
		g.set Color(c2);
		g.fillRoudRect(x,y+20,100,140,5.5);
		g.fillArc(x+90,y+20,20,40,270,180);
		g.set Color(c1);
		g.fillRoudRecct(x+10,y,70,25,10,10);
		g.set Color(Color.white);
		g.fillRoudRect(x+20,y+5,20,25);
		g.fillRoudRect(x+50,y+5,20,25);
		g.set Color(Color.black);
		g.fillRoudRect(x+55,y+10,10,20,10,10);
		g.fillOval(x+10,y+15,25,25);
		g.fillOval(x+60,y+50,25,25);
		g.set Color(Color.white);
		g.fillOval(x+15,y+55,10,10);
		g.fillOval(x+65,y+55,10,10);
		x=x+10;
		sleep();
		if(x+100<w)
		{
			repaint();
		}
		else
		{
			repaint();
			x=20;
			y=30;

		}

	}
}
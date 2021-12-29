import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="XOR" width=300 height=200>
</applet>*/
public class XOR extends Applet
{
	int chsX=100, chsY=100;
	public XOR()
	{
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent me)
			{
				int x = me.getX();
				int y = me.getY();
				chsX = x-10;
				chsY = y-10;
				repaint();
			}
			
		});
	}
	public void paint(Graphics g)
	{
		g.drawLine(0,0,100,100);
		g.drawLine(0,100,100,0);
		
		g.setColor(Color.red);
		g.drawLine(10,10,50,50);
		g.fillOval(70,90,140,100);
		
		g.setColor(Color.blue);
		g.drawOval(190,10,90,30);
		g.drawRect(10,10,60,50);
		
		g.setColor(Color.cyan);
		g.fillRect(100,10,60,50);
		g.drawRoundRect(190,10,60,50,15,15);
		
		g.setColor(Color.green);
		g.drawRect(10,10,60,50);
		g.fillRect(100,10,60,50);
		
		//xor cross hairs
		g.setXORMode(Color.black);
		g.drawLine(chsX-10,chsY,chsX+10,chsY);
		g.drawLine(chsX,chsY-10,chsX,chsY+10);
		g.setPaintMode();
		
	}
}
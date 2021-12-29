import java.awt.*;
import java.applet.*;
/*<applet code="Rectangles" width=300 height=200>
</applet>*/
public class Rectangles extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10,10,90,50);
		g.fillRect(100,30,80,40);
		g.drawRoundRect(190,10,60,50,50,50);
	}
}
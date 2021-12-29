import java.awt.*;
import java.applet.*;
/*<applet code="HourGlass" width=300 height=200>
</applet>*/
public class HourGlass extends Applet
{
	public class paint(Graphics g)
	{
		int xpoints[] = {30, 200, 30, 200, 30};
		int ypoints[] = {30, 30, 200, 200, 30};
		int num = 5;
		
		g.drawPolygon(xpoints, ypoints, num);
	}
}
//demonstrate check boxes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code = "CheckboxDemo" width = 250 height = 200>
</applet>*/
public class CheckboxDemo extends Applet implements ItemListener
{
	String msg = " ";
	Checkbox Win98, WinNT;
	public void init()
	{
		Win98 = new Checkbox("Windows 98/xp",null,true);
		WinNT = new Checkbox("Windows NT/2000");
		
		add(Win98);
		add(WinNT);
		
		Win98.addItemListener(this);
		WinNT.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	//display current state of the check boxes.
	public void paint(Graphics g)
	{
		msg = "current state:";
		g.drawString(msg,6,80);
		msg = "Windows 98/xp:" + Win98.getState();
		//msg = "current state:";
		g.drawString(msg,6,100);
		msg = "windows NT/2000:" + WinNT.getState();
		g.drawString(msg,6,120);
	}
}
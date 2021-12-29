//demonstrate choice list.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "ChoiceDemo" width=300 height=180>
</applet>*/

public class ChoiceDemo extends Applet implements ItemListener
{
	Choice os , browser;
	String msg =" ";
	
	public void init()
	{
		os = new Choice();
		browser = new Choice();
		
		//add items to os list
		os.add("windows");
		os.add("unix");
		
		//add items to browser list
		browser.add("Netscape 3.x");
		browser.add("Netscape 4.x");
		
		browser.select("Netscape 4.x");
		
		//add choice lists to window
		add(os);
		add(browser);
		
		//register to receive item events
		os.addItemListener(this);
		browser.addItemListener(this);
	}
		public void itemStateChanged(ItemEvent ie)
		{
			repaint();
		}
		//display current selections.
		public void paint(Graphics g)
		{
			msg = "current os:";
			msg += os.getSelectedItem();
			g.drawString(msg,6,120);
			msg = "current browser:";
			msg += browser.getSelectedItem();
			g.drawString(msg,6,140);
		}
}
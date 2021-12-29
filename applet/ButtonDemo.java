//Demostrate Button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="ButtonDemo" width=250 height=150>
</applet>*/
public class ButtonDemo extends Applet implements ActionListener
{
	String msg = " ";
	Button yes, no, maybe;
	
	public void init()
	{
		yes = new Button("yes");
		no = new Button("no");
		maybe = new Button("undecided");
		
		add(yes);
		add(no);
		add(maybe);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str.equals("yes"))
		{
			msg = "You pressed Yes";
		}
		else if(str.equals("no"))
		{
			msg = "you pressed no";
		}
		else
		{
			msg = "You pressed Undecided";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,6,100);
	}
}
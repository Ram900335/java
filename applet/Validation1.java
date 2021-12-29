import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;

class Validation1 extends JFrame
{
	JTextField text;
	JLabel l1,l2;
	JPanel p;
	Validation1()
	{
		text = new JTextField(15);
		l1 = new JLabel("ID:");
		l2 = new JLabel("*Enter only Numeric Value");
		p = new JPanel();
		p.add(l1);
		p.add(text);
		p.add(l2);
		l2.setVisible(false);
		text.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) 
			{
				String input=text.getText();
				Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
				Matcher m = p.matcher(input);
				if (m.find())
				{
					l2.setVisible(true);
					l2.setForeground(Color.RED);
				}
				else
				{
					l2.setVisible(false);
				}
			}
		});
		add(p);
		setVisible(true);
		setSize(300,300);
	}
		public static void main(String[]args)
		{
			Validation1 v=new Validation1();
		}
}
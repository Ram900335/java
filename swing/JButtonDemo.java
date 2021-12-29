import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="JButtonDemo" width=250 height=300>
</applet>
*/
public class JButtonDemo extends JApplet implements ActionListener
{
	JTextField jtf;
	public void init()
	{
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon france = new ImageIcon("france.gif");
		JButton jb = new JButton(france);
		jb.setActionCommand("France");
		jb.addActionListener(this);
		contentPane.add(jb);
		
		jtf = new JTextField (15);
		contentPane.add(jtf);
	}
	public void actionPerformed(ActionEvent ae)
	{
		jtf.setText(ae.getActionCommand());
	}
}
//WRITE TEXTFIELD
import java.awt.*;
import javax.swing.*;
/*
<applet code = "JTextFieldDemo" width = 500 height=200>
</applet>*/

public class JTextFieldDemo extends JApplet
{
	JTextField jtf;
	
	public void init()
	{
		//get content pane
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		//add Text Field to content pane
		
		jtf = new JTextField(15);
		contentPane.add(jtf);
	}
}
import java.awt.*;
import java.awt.event.*;
public class FrameTest extends Frame implements ActionListener
{
    String title;
    Button b1, b2;
    TextField text1, text2;
    public FrameTest(String title)
    {
       super(title);
       setLayout(new FlowLayout());
       text1 = new TextField(20);
       b1 = new Button("Reset");
       text2 = new TextField(20);
       b2 = new Button("Submit");
       add(text1);
       add(b1);
       add(text2);
       add(b2);
       b1.addActionListener(this);
       b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       String str = "";
       if(e.getSource() == b1)
       {
          text1.setText(str+" You click reset button..");
       }
       if(e.getSource() == b2)
       {
          text2.setText(str+" You click submit button..");
       }
    }
    public static void main(String args[])
    {
        FrameTest frame = new FrameTest("Frame with TextField & Button:");
        frame.setSize(300,200);
        frame.setBackground(Color.pink);
        frame.setVisible(true);
    }
}
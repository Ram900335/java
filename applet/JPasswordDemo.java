import javax.swing.*;
public class JPasswordDemo
{
   public static void main(String args[])
   {
      JFrame frame = new JFrame("JPasswordField & JTextField");
      JPanel panel = new JPanel();
      JLabel l1 = new JLabel("Username");
      JLabel l2 = new JLabel("Password");
      JLabel l3 = new JLabel("Confirm !!!");
      JTextField text = new JTextField(20);
      JPasswordField pass1 = new JPasswordField(20);
      JPasswordField pass2 = new JPasswordField(20);
      panel.add(l1);
      panel.add(text);
      panel.add(l2);
      panel.add(pass1);
      panel.add(l3);
      panel.add(pass2);
      frame.add(panel);
      frame.setSize(350, 150);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class LoginDemo extends JFrame{
 JButton SUBMIT;
 JLabel label1,label2,lab;
 final JTextField  text1,text2;
  LoginDemo(){
     lab=new JLabel();
     ImageIcon icon=new ImageIcon("c:/image.gif");
     lab.setIcon(icon);

    setTitle("Login Form");
    setLayout(null);
    label1 = new JLabel();
    label1.setText("Username:");
    text1 = new JTextField(15);

    label2 = new JLabel();
    label2.setText("Password:");
    text2 = new JPasswordField(15);

    SUBMIT=new JButton("SUBMIT");
    lab.setBounds(380,50,50,30);
    label1.setBounds(350,100,100,20);
    text1.setBounds(450,100,200,20);
    label2.setBounds(350,130,100,20);
    text2.setBounds(450,130,200,20);
    SUBMIT.setBounds(450,160,100,20);
    add(lab);
   add(label1);
   add(text1);
   add(label2);
   add(text2);
   add(SUBMIT);

   setVisible(true);
   setSize(1024,768);

 SUBMIT.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    String value1=text1.getText();
    String value2=text2.getText();
    try{
 Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from login where username='"+value1+"' and password='"+value2+"'");
           String uname="",pass="";
           if(rs.next()){
               uname=rs.getString("username");
               pass=rs.getString("password");
           }
 if(value1.equals("") && value2.equals("")) {
      JOptionPane.showMessageDialog(null,"Enter login name or password","Error",JOptionPane.ERROR_MESSAGE);
  }
 else if(value1.equals(uname) && value2.equals(pass)) {
    NextPage page=new NextPage(uname);
    page.setVisible(true);
    }
 else if (!value1.equals(uname) && !value2.equals(pass)) {
     text1.setText("");
     text2.setText("");
    }
    }
    catch(Exception e){}
}
 });
  }

  public static void main(String arg[]){
  new LoginDemo();
}
}


class NextPage extends JFrame
{
  NextPage(String st)
   {
      setLayout(null);
     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
     setTitle("Welcome");
     JLabel lab=new JLabel("Welcome  "+st);

     lab.setBounds(10,10,500,20);
     add(lab);

       setSize(1024, 768);
      }
 }
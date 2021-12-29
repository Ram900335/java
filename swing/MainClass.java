package roseindia.net;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainClass implements ActionListener
{
	 ShortAddress sa = new ShortAddress();
	 FullAddress fa = new FullAddress();	 
	 
     JTextField fName = new JTextField();
     JTextField sName = new JTextField();
     JTextField phNum = new JTextField();
     JTextField hNum = new JTextField();
     JTextField add1 = new JTextField();
     JTextField add2 = new JTextField();
     JTextField city = new JTextField();
     JTextField pinCode = new JTextField();
     
     JButton sButton = new JButton("Short Address");
     JButton dButton = new JButton("Full Address");
     JFrame frame;    
     
     public void createUI()
      {         
         frame = new JFrame("Show Address Example");
         frame.setLayout(null);
         frame.setSize(700,500);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JLabel lab1 = new JLabel("Enter First Name ");
         JLabel lab2 = new JLabel("Enter Second Name "); 
         JLabel lab3 = new JLabel("Address Detail.....");   
         JLabel lab4 = new JLabel("Enter House Number ");         
         JLabel lab5 = new JLabel("Add Line 1 ");
         JLabel lab6 = new JLabel("Add Line 2 ");
         JLabel lab7 = new JLabel("City ");
         JLabel lab8 = new JLabel("PIN Code ");
         JLabel lab9 = new JLabel("Enter Phone Number ");        
         
         lab1.setBounds(10,40,100,20);
         fName.setBounds(370,40,120,30);

         lab2.setBounds(10,70,150,20);
         sName.setBounds(370,70,120,30);         

         lab3.setBounds(10,100,150,20);
         
         lab4.setBounds(10,130,150,20);
         hNum.setBounds(370,130,120,30);         
         
         lab5.setBounds(10,160,150,20);
         add1.setBounds(370,160,120,30);         

         lab6.setBounds(10,190,150,20);
         add2.setBounds(370,190,120,30);         
         
         lab7.setBounds(10,220,150,20);
         city.setBounds(370,220,120,30);         
         
         lab8.setBounds(10,250,150,20);
         pinCode.setBounds(370,250,120,30);         
         
         lab9.setBounds(10,280,150,20);
         phNum.setBounds(370,280,120,30);         
         
         sButton.setBounds(50, 430, 150, 30);
         sButton.addActionListener(this);
         
         dButton.setBounds(300, 430, 150, 30);
         dButton.addActionListener(this);
         
         frame.add(lab1);        
         frame.add(fName);

         frame.add(lab2);        
         frame.add(sName);

         frame.add(lab3);
         
         frame.add(lab4);
         frame.add(hNum);

         frame.add(lab5);        
         frame.add(add1);
         
         frame.add(lab6);        
         frame.add(add2);
         
         frame.add(lab7);        
         frame.add(city);
         
         frame.add(lab8);        
         frame.add(pinCode);
         
         frame.add(lab9);        
         frame.add(phNum);
         
         frame.add(sButton);
         frame.add(dButton);

      }// createUI() method closed
     
     public void setValues()
     {
    	 sa.setFirstName(fName.getText());
    	 sa.setSecondName(sName.getText());
    	 sa.setPhoneNumber(Integer.parseInt(phNum.getText()));
    	 
    	 fa.setFirstName(fName.getText());
    	 fa.setSecondName(sName.getText());
    	 fa.setPhoneNumber(Integer.parseInt(phNum.getText()));
    	 fa.setHouseNumber(hNum.getText());
    	 fa.setAdd1(add1.getText());
    	 fa.setAdd2(add2.getText());
    	 fa.setCityName(city.getText());
    	 fa.setPincode(Integer.parseInt(pinCode.getText()));
     }// setValues() method closed
     
     @Override
 	public void actionPerformed(ActionEvent e) {
    	 JButton newButton = (JButton)e.getSource();
    	 setValues();
    	 if(newButton.equals(sButton))
    	  {
    		 sa.display(sa);
    	  }
    	 if(newButton.equals(dButton))
    	 {    		
    		fa.display(fa); 
    	 }    	 
 	}

      public static void main(String args[])
        {
            MainClass main = new MainClass();
            main.createUI();
        }// main() method closed	

}// class closed
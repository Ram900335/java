import java.applet.Applet;
import java.awt.*;


// the name of the class StickMan sould be in a file StickMan.java

public class StickMan extends Applet
{
    public void paint (Graphics page)
    {
	   
       setBackground(Color.black);
       setForeground(Color.red);
       
       // the syntax of drawRect is (x1,y1,w,h)
       //    where (x1,y1) is position of the top left corner and
       //    w and h are width and height respectively
       
       // draw a boundary 
       page.drawRect(5,5,190,190);
       
       // the syntax of drawOval is (x1,y1,w,h)
       //    where (x1,y1) is the top left corner  and
       //    (w,h) is the width and height of the bounding rectangle
	
       // the head
       page.drawOval(90,60,20,20);
       
       // the syntax of drawLine is (x1,y1,x2,y2);
       // to draw a line from point (x1,y1) to (x2,y2)
       
       // the body
       page.drawLine(100,80,100,120);
       
       // the hands
       page.drawLine(100,100,80,100);
       page.drawLine(100,100,120,75);
       
       // the legs
       page.drawLine(100,120,85,135);
       page.drawLine(100,120,115,135);
       
       // the greeting
       page.drawString("Hi there", 20, 180);
     
    }// end paint
    
}// end StickMan
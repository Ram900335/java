import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
class Ball
{
        int x,y,radius,dx,dy;
        Color BallColor;

        public Ball(int x,int y,int radius,int dx,int dy,Color bColor)
        {
                this.x=x;
                this.y=y;
                this.radius=radius;
                this.dx=dx;
                this.dy=dy;
                BallColor=bColor;
        }
}
public class Bounce extends Applet implements Runnable
{
        Ball redBall;
 
        public void init()
        {
                redBall=new Ball(250,80,50,2,4,Color.red);
                Thread t=new Thread(this);
                t.start();
        }
        public void paint(Graphics g)
        {
                g.setColor(redBall.BallColor);
                setBackground(Color.pink);
                //g.setcolor(redBall.BallColor);
                g.fillOval(redBall.x, redBall.y,
                redBall.radius,redBall.radius);
                g.drawLine(150,400,50,500);
                g.drawLine(150,400,450,400);
                g.drawLine(50,500,350,500);
                g.drawLine(450,400,350,500);
                g.drawRect(50,500,20,100);
                g.drawRect(330,500,20,100);
                g.drawLine(450,400,450,500);
                g.drawLine(430,500,450,500);
                g.drawLine(430,500,430,420);
        }
         public void run()
        {
        while(true)
        {
                try
                {
                        displacementOperation(redBall);
                        Thread.sleep(20);
                        repaint();
                }
        catch(Exception e){}
        }
        }
        public void displacementOperation(Ball ball)
        {
                if(ball.y >= 400 || ball.y <= 0)
        {
                ball.dy=-ball.dy;
        }
        ball.y=ball.y+ball.dy;
        }
}
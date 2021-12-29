import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public final class LogoAnimator extends JPanel implements ActionListener, Serializable
{
	protected ImageIcon images[];
	protected int totalImages = 30,currentImage = 0,animationDelay = 50;
	protected Timer animationTimer;

	public LogoAnimator()
	{
		setSize(getPreferredSize());
		images = new ImageIcon[totalImages];
		URL url;
		for(int i=0; i<images.length; ++i)
		{
			url = getClass().getResource("deitel" +i+".gif");
			images[i]=new ImageIcon(url);
		}
		startAnimation();
	}
  
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(images[currentImage].getImageLoadStatus()==
			MediaTracker.COMPLETE)
		{
			g.setColor(getBackground());
			g.drawRect(0,0,getSize().width,getSize().height);
			images[currentImage].paintIcon(this,g,0,0);
			currentImage = (currentImage+1)%totalImages;
		}
	}
     
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	public void startAnimation()
	{
		if(animationTimer == null)
		{
			currentImage = 0;
			animationTimer = new Timer(animationDelay,this);
			animationTimer.start();
		}
		else
		
			if(!animationTimer.isRunning())
				animationTimer.restart();
	}
	public void stopAnimation()
	{
		animationTimer.stop();
	}
	public Dimension getMinimunSize()
	{
		return getPreferredSize();
	}
    
	public Dimension getPreferredSize()
	{
		return new Dimension(160,80);
	}
	public static void main(String args[])
	{
		LogoAnimator anim = new LogoAnimator();

		JFrame app = new JFrame("Animator test");
		app.getContentPane().add(anim,BorderLayout.CENTER);

		app.addWindowListener(new WindowAdapter()
		{
                        @Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		app.setSize(anim.getPreferredSize().width + 10,anim.getPreferredSize().height + 30);
		app.show();
	}

    

}
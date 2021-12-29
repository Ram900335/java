//Demonstrate Lables
import java.awt.*;
import java.applet.*;
/*<applet code="LabelDemo" width=300 height=200>
</applet>*/
public class LabelDemo extends Applet
{
	
	public void init()
	{
		Label one = new Label ("one");
		Label two = new Label ("two");
		Label three = new Label ("three");
		
		//add labels to applet window
		add(one);
		add(two);
		add(three);
	}
}
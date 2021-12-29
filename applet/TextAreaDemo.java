//demonstrate textarea.
import java.awt.*;
import java.applet.*;
/*<applet code = "TextAreaDemo" width=500 height=250>
</applet>*/

public class TextAreaDemo extends Applet
{
	public void init()
	{
		String val = "There are two ways of constructing" + "a software design./n";
		
		TextArea text = new TextArea(val , 10, 30);
		add(text);
	}
}
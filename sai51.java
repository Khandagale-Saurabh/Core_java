import java.awt.*;
import java.applet.*;
public class sai51 extends Applet
{
	public void init()
	{
		setBackground(Color.red);
		}
   public void paint(Graphics g)
   {
       g.drawLine (222,104,220,104);
       g.drawRect(10,20,30,10);
       g.fillRect(10,20,30,10);
   }
}
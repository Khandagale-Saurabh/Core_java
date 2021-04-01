import java.awt.*;
import java.applet.*;
public class sai3 extends Applet
{
  String name;
   public void init()
   {
      setBackground(Color.blue);
      setForeground(Color.pink);
   }
   public void start( )
   {
      name=getParameter("Param1");
   }
   public void paint(Graphics g)
   {
	   g.drawString(name,50,170);
	   }
}
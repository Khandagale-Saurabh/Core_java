import java.awt.*;
import java.applet.Applet;
public class sai35 extends Applet
{
	private int left,right,h,w;
	public void init()
	{

	left=diff(30);
	right=diff(30);
	h=diff(30);
	w=diff(30);
}
	public void paint(Graphics g)
				 	{
				 		g.drawString("sai",200,200);
				 		g.drawRect(diff(left),diff(left),405,505);
				 		g.fillRect(0,0,20,44);
				 		g.fillRect(diff(left),diff(right),diff(h),diff(w));
	                 }

	         int diff(int range)
	         {
				  int r;
				  r=(int)Math.random()*range;
				  return r;
			 }
}
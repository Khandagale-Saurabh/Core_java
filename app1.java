import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class app1 extends Applet
{

private int height,width,rleft,rrigth,rtop;
	public void init()
	{

		 width=getSize().width;
         height=getSize().height;
         rleft=width/3;
         rrigth=width/3;
         rtop=height/3;
		System.out.println("init");


	}
	public void diff()
	{

	}
	public void start()
	{
		System.out.println("Start");
	}
	public void stop()
	{
		System.out.println("Stop");
	}
	public void destory()
	{
		System.out.println("Destory");
	}

	public void paint(Graphics g)

	{
	//	 g.getOval(Color.red);
		setBackground(Color.pink);
		g.drawString("Saurabh",width,height);
		g.drawRect(rleft,rtop,width,height);
		g.fillRect(rleft,rtop,width,height);
        g.setColor(Color.red);
		g.fillOval(55,25,330,330);
		g.setColor(Color.blue);
		g.fillOval(50,20,300,300);


	}
}

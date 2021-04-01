import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class sai50 extends Applet implements KeyListener
{
	TextArea p1=new TextArea();
    public void init()
    {
		 addKeyListener(this);
		add(p1);
    }
    public void keyPressed(KeyEvent e)
    {
       System.out.println("Inside pressed");
    }

            public void keyTyped(KeyEvent e)
            {
               System.out.println("innnn");
    }
        public void keyReleased(KeyEvent e)
        {
           System.out.println("Inside reles");
    }
}
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class event3 extends Applet implements KeyListener ,AdjustmentListener
{
    public void init()
    {
      TextArea a1=new TextArea();
      Scrollbar h1,h2;
      h1=new Scrollbar(Scrollbar.HORIZONTAL,1,1,3,200);
         h1.addAdjustmentListener(this);
add(h1,Scrollbar.HORIZONTAL);
      addKeyListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent w)
    {

		}















    public void keyPressed(KeyEvent w)
    {
      System.out.println("Inside prssed");
    }

    public void keyReleased(KeyEvent w)
    {
      System.out.println("Inside Realesed");
    }

        public void keyTyped(KeyEvent w)
        {
          System.out.println("Inside typed");
    }
}
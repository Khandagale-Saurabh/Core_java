import java.awt.*;
import java.applet.*;
public class sai53 extends Applets implements Runnable
{
   Thread t1;
      private int x1,x2,y1,y2;
      private  int width,height;
      private String s1="saurabh";
      private boolean lefttoright=true;
      public void init()
      {

		  width=getSize().width;
		  height=getSize().height;

		            x1=50;
		            x2=50;
		            y1=50;
                    y2=50;
           t1.start(this);

		  }
    public void run()
    {
		if(lefttoright==true)
		{

          while(true)
          {


                x=x+30;

         }
	   }
    }

      public void paint(Graphics d)
     {
        d.drawString(str1,x1,y1);
     }
   // void repaint();


   public static void main(String ss[])
   {
    Thread t1=new Thread();
   }

}
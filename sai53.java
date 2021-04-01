import java.awt.*;
import java.applet.*;
public class sai53 extends Applet implements Runnable
{
   Thread t1;
      private int x1,x2,y1,y2;
      private  int width,height;
      public String s1="saurabh";
      private boolean lefttoright=true;
      public void init()
      {

		  width=getSize().width;
		  height=getSize().height;


		  t1=new Thread(this);
		            x1=50;
		            x2=50;
		            y1=50;
                    y2=50;
           t1.start();

		  }
    public void run()
    {
		while(true)
		{

          if(lefttoright==true)
          {


                x1=x1+30;


         }
	   }
	   try
	   {
		   Thread.sleep(300);
		   }
		   catch(Exception e)
		   {}
     repaint();

    }

      public void paint(Graphics d)
     {
        d.drawString(s1,x1,y1);
     }

   public static void main(String ss[])
   {
    Thread t1=new Thread();
   }

}

import java.awt.*;
import java.applet.*;
import java.lang.*;
import java.util.*;
public class sai63 extends Applet
{
	 int
	 a =(int)Math.random()*200;

Font f=new Font("BOLD",Font.BOLD,99);
    public void paint(Graphics ss)
    {
		   for(int i=0;i<=10;i++)
		   {
			  int  s2=(int)Math.random()*100;

			  int  s1=(int)Math.random()*100;

                  ss.drawString("Saurabh",s1+444,s2);
ss.setFont(f);
	           ss.setFont(f);
               ss.drawString("Khandagale",s1,100);
           }
   }

}

//<APPLET CODE ="sai63.class" WIDTH="400" HEIGHT="500"> </APPLET>
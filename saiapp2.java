import java.applet.Applet;
import java.awt.*;
public class saiapp2 extends Applet
{int a[]={10,150,150,10,3,3,3};
int b[]={20,150,80,20,3,3,3};
int c=a.length;
  public void init()
  {
      setBackground(Color.blue);
  }
  public void paint(Graphics g)
  {
   g.drawRect(150,50,100,150);

     g.drawRect(125,175,60,60);
     g.drawArc(200,200,200,200,0,180);
      g.fillArc(200,200,200,200,0,-180);
    g.drawLine(10,0,100,120);
g.drawLine(100,120,10,0);
    g.drawLine(10,0,100,120);
    g.drawString("Saurabh",30,50);

  }
}
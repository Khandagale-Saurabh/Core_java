import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class event1 extends Applet implements ActionListener
{
  Button b1,b2,b3;
  public void init()
  {
	  b1=new Button ("red");
         b1.addActionListener(this);
	  b2=new Button("blue");
          b2.addActionListener(this);
	  b3=new Button("Green");
	  add(b1);
	  add(b2);
	  add(b3);
	  //FlowLayout(this);
	  }
	  public void actionPerformed(ActionEvent j)
	  {
		  if(j.getSource()==b1)
		  {
			  setBackground(Color.red);
			  }
			   else if(j.getSource()==b2)
			  		  {
			  			  setBackground(Color.blue);
			  }
		  }

}
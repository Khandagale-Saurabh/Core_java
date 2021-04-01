import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class event2 extends Applet implements ActionListener, ItemListener,KeyListener
{
	Button b1,b2,b3;
	TextField t1,t2;
	Checkbox c1,c2,c3;
	CheckboxGroup cc;
	 public void init()
	 {
		 Panel p1=new Panel();
		 p1.setSize(100,100);
             b1=new Button("Red");

             b2=new Button("Green");
             b3=new Button("Blue");
             b1.addActionListener(this);

                    b2.addActionListener(this);
                   // b2.addActionListener(this);
                    add(b1);
                    add(b2);

            add(b3);
            c1=new Checkbox("First",cc,true);
            c2=new Checkbox ("Second",cc,false);
            c3=new Checkbox("Thirg",cc,false);
           add(c1);
           add(c2);
           add(c3);
           add(p1);

		 }

		 public void keyReleased(KeyEvent r1)

		 {

			   System.out.println("Released");
			 }

			 		 public void keyPressed(KeyEvent r1)

			 		 {
			 			   System.out.println("pressed");
			 }
			 	 public void keyTyped(KeyEvent r1)

			 			 		 {
			 			 			   System.out.println("typer");
			 }
		    public void itemStateChanged(ItemEvent  e11)
		 		   {
					   repaint();
			    }


		 public void actionPerformed(ActionEvent ww)
		 {
			   if(ww.getSource()==b1)
			   {
				   t1=new TextField("Saurabh");
				   add(t1);
				   b1.setBackground(Color.red);


				   }
			 }
	}
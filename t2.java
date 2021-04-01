class t2 extends Thread
{
  public void run()
  {
     for(int i=0;i<=10;i++)
     {
       System.out.println(""+Thread.currentThread().getName());
        setPriority(4);

        try
        {
           Thread.sleep(1000);
	    }catch(InterruptedException e)
	    {
			}

     }
  }
  public static void main(String args[])
  {
     t2  o=new t2();
     o.start();

          for(int i=0;i<=10;i++)
          {
            System.out.println(""+Thread.currentThread().getName());
             o.setPriority(4);
       try
	            {
	              Thread.sleep(1000);
	   	        }catch(InterruptedException e)
	   	         {
			     }
          }

  }
}
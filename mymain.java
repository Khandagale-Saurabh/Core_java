class hi extends Thread
{
  public void run()
  {

	       try
     {
   for(int i=0;i<=5;i++)
   {
     System.out.println("HI");

		 Thread.sleep(400);
	  }
	  catch(Exception b)
	  {
		  }
   }

   }
}
class hello extends Thread
{
  public void run()
  {
     for(int i=0;i<=5;i++)
     {
       System.out.println("Hello");
        try
			      {
			 		 Thread.sleep(200);
			 	  }
			 	  catch(Exception b)
			 	  {
		  }
     }


     }
}

class mymain
{
  public static void main(String args[])
  {
    hi obj1=new hi();
    hello obj2=new hello();
    obj1.start();

    obj1.run();
    obj2.run();
  }
}
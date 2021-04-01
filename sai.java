class sai extends Thread
{
  public void run()
  {

	       for(int i=0;i<=10;i++)
	       {
	         System.out.println(""+Thread.currentThread().getName());
     }
  }
  public static void main(String args[])
  {


         sai s1=new sai();
         s1.start();
         synchronized(s1)
         {
         for(int i=0;i<=10;i++)
         {
           System.out.println(""+Thread.currentThread().getName());
        }

		     for(int j=0;j<=10;j++)
		     {
		       System.out.println(""+Thread.currentThread().getName());
     }
	}
  }

}
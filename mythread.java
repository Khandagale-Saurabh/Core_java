
class mythread extends Thread
{

     public void run()
     {
		for( int i=0;i<=10;i++)
        System.out.println(""+Thread.currentThread().getName());
     }

     public static void main(String args[])
     {
        mythread t1=new mythread();
        mythread t2=new mythread();
        t1.setName("Saurabh");

       // t1.setPriority(3);



         //t1.run();

        try
        {
        for( int j=0;j<=10;j++)
		         System.out.println(""+Thread.currentThread());

        t1.start();
        t1.sleep(2000);

        }catch(InterruptedException ee)
        {
			}

     }
}
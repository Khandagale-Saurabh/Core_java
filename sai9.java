interface i1
{
	public void imp1();

	}
	interface i2 extends i1
	{
		public void imp2();
		}



abstract class base implements i2
{
	public void imp1()
		   {

		      System.out.println("inside imp1() of base()");
	   }
	public void imp2()
	   {

	      System.out.println("inside imp2() of base()");
	   }

   public void f1()
   {

      System.out.println("inside f1 of base()");
	   }
   public abstract void display();
}
class der extends base
{
	der(int a,int b)
	    {

      System.out.println("  "+a+"   "+b);

		}
	public void display()
	      {

      System.out.println("in der()");
		  }
	}
class sai9
{
   public static void main(String aa[])
   {
      der b=new der(20,30);
      b.f1();
      b.imp1();
      b.imp2();

   }
}

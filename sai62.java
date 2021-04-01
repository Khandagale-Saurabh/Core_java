class sai62
{
	public
	   int a=10,b;
	void fun() throws Exception
	       {
			   b=a/0;
		   }
   public static void main(String aaa[])
   {


       try
         {
			sai62 n=new sai62();
			n.fun();

           System.out.println("Inside try block");

         }catch(Exception ee)
         {
		                    System.out.println("Inside catch block");

         }
         finally
         {
           System.out.println("Inside finally block");

         }
   }
}
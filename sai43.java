class p
{
    public static void  ptr(String e)
   {
     System.out.println(""+e);
   }
}
class sai43
{

   public void show()throws Exception
   {

		  throw new Exception();


   }
   public static  void main(String p1[])
   {
	   sai43 s=new sai43();

	  try
	  {
		  s.show();
		  }catch(Throwable e)
	  {
		  p.ptr(""+e);
		  }

   }
}

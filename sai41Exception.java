class sai41Exception
{
   public  void show() throws SaiException
   {
	  throw new SaiException();
   }
   public static void main(String a[])
   {
      sai40Exception obj=new sai40Exception();

   try{
		 obj.show();
}catch(SaiException e)
{
		 System.out.println(""+e);
}

   }
}
class SaiException extends Exception
{
   SaiException()
   {
     System.out.println("SAIEXCEPTION() ARISE ");
    // SaiException.printStacktrace();
   }
}

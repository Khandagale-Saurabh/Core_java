class sai40Exception
{
   public  void show()
   {
      try{throw  new SaiException();}catch(SaiException e)
      {
		  e.printStackTrace();
		  }
    //  System.out.println("Inside Show()");
   }
   public static void main(String a[])
   {
      sai40Exception obj=new sai40Exception();
      obj.show();

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

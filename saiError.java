class saiError
{

    public void display() throw Error
    {
        throw new Error();
    }
   public static  void main(String aa[])
   {
      saiError e1=new saiError();
      e1.display();
   }
}

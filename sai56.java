
class sai55 extends Exception
{
   public sai55()
   {
     super();
   }
   public String toString()
   {
      return "ExceptionByMe";
   }
}
   class sai56
   {
     public static void main(String rgs[])
         {

            try
            {


                throw new sai55();

             }catch(sai55 ee)
              {
               System.out.println("MYexc1");
              }

         }

    }

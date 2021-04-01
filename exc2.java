class exc2
{
  void read()
  {
       try
       {
          try
                  {
                     throw new ArrayIndexOutOfBond();

                   }catch(ArrayIndexOutOfBond e)
                  {
                     System.out.println("InputMismatchException");
                   }
       throw new ArithmeticException();
       } catch(ArithmeticException a)
          {
         System.out.println("ArithmeticException");
         }
  }

  public static void main(String args[])
  {
     exc2 e=new exc();
     e.read();
  }
}
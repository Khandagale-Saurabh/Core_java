import java.util.*;
class exc
{
   int a,b,c,a1,a2;
//   Random r=new Random();
       public exc()
       {
		   super();
		   }
		  public String toString()
		   {
			   return "Negative numbe";
			   }


   public void read()
   {













   try
      {

      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      if(a<=0||b<=0)
        {
            throw new exc();
        }


        else
        {
           c=a+b;
           System.out.println("Sum"+c);
        }
      }
      catch(exc e)
	          {
	              System.out.println("NegativeNumberException");
              }
	}




  public static void main(String args[])
  {
       exc e=new exc();
       e.read();
  }
}
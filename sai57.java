import java.util.*;

class NegativeNumber extends Exception
{
   NegativeNumber()
   {
     super();
   }
   public String toString()
   {
      return "NegativeNumber";
   }
}

class sai57
{
 public static void main(String at[])
  {


            try
            {
                int a,b,c;
                  Scanner ss=new Scanner(System.in);

                  a=ss.nextInt();
                  b=ss.nextInt();

                  if(a<=0||b<=0)
                  {
                  throw new NegativeNumber();
                  }
                  else
                  {
                  c=a/b;
               System.out.println("Sum"+c);

                 }
             }catch(NegativeNumber ee)
             {
               System.out.println("NegativeNumber");
             }


  }
}

import java.util.*;
class UnderAgeException extends Exception
{
    UnderAgeException()
    {

                 System.out.println("Sorry your age is under 18");
    }

}


class sai31_userException
{
   public static void main(String aa[]) throws Exception
   {
    String parties[]={"BJP","Congress","BSP"};
     int bjp=0,congress=0,bsp=0;

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter age?");
      int age=sc.nextInt();
      if(age<=18)
      {
         throw new UnderAgeException();
      }
      else
      {
         System.out.println("You r eligible to vote");
         System.out.println("1 :BJP \t 2: Cogress \t 3: BSP ");
         Scanner p=new Scanner(System.in);
            String ap=p.nextLine();
         switch(ap)
         {
            case "bjp":
                 bjp++;
                 System.out.println(""+bjp);
                 break;
                 case "congress":
                          congress++;

                 System.out.println(""+congress);
                          break;
                          case "bsp":

                 System.out.println("bsp");
                            bsp++;
         }
      }
   }
}

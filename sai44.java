import java.util.*;
class sai44
{

   public static void main(String aaaa[]) throws Exception
   {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int i=0,=0;
     int sum=0;

       h=i;
     while(i>0)
     {
        k=h%10;
        sum=sum+(k*k*k);
        i=i/10;
     }

      if(h==sum)
       {
          p.ptr("Amstrong");
       }
       else
       {

                 try
                 {
                 throw new ArmException();
                 }catch(Exception e)
                 {
                   System.out.println(""+e);
                 }
       }
   }
}

class ArmException extends Exception
{
  ArmException()
  {
     super();
  }
  String toString(String s)
  {
    return "ArmStrong Exception";
  }
}

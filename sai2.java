import java.util.*;
class sai2
{
   public static void main(String a11[])
   {
     int a,b,sum;
      String s1,s2,s3;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a");
      a=s.nextInt();
     System.out.println("Enter b");
     b=s.nextInt();
     sum=a+b;
     System.out.print("Sum:"+sum);
     System.out.println("Enter String1 ");
     s1=s.nextLine();

     System.out.println("Enter String2 ");

     s2=s.nextLine();
     s3=s1+s2;
     System.out.print(s3);

   }
}

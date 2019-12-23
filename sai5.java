import java.io.*;
import java.util.*;
class sai5
{
  public static void main(String aa[]) throws Exception
    {
		int r,sum=0,t=0,n;
         Scanner s=new Scanner(System.in);

         System.out.println("Enter Data?");
         n=s.nextInt();
         System.out.println(""+n);
         t=n;
         while(n>0)
         {
			 r=n%10;
			 sum=sum+(r*r*r);
			 n=n/10;
			 }
			 if(t==sum)
			System.out.println(" Is Amstrong");
              else
             System.out.println("Not Amstrong");
    }
}

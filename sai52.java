import java.util.*;
class sai52
{
   public static void main(String aaa[])
   {
         char mar[]={'q','w','f','t'};
        char c[]=new char[mar.length];
        System.arraycopy(mar,0,c,0,mar.length);
        for(int i=0;i<=c.length-1;i++)
        {
           System.out.print(" "+c[i]);
        }
   }
}

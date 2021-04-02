import java.io.*;
class p
{
  public static void ptr(String a)
  {
      System.out.print(""+a);
  }

    public static  void  ln(String a)
    {
        System.out.println(""+a);
  }
}
class sai47b
{
   public static void main(String args[]) throws Exception
   {
       BufferedReader br=new BufferedReader(new FileReader("tmp.txt"));
       String s;
       while((s=br.readLine())!=null)
       {
		   p.ptr(""+s);

       }
   }
 }

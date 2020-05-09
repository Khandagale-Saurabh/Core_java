import java.io.*;
import java.util.*;
class File3
{
  public static void main(String sai[]) throws Exception
    {
       Scanner sc=new Scanner(new File("C:/Users/saurabh/Desktop/bs1.txt"));
       ArrayList<String> listS=new ArrayList<String>();

       while(sc.hasNextLine())
       {
          listS.add(sc.next());
          System.out.println(listS);

       }

	 }
}

import java.io.*;
class sai36
{
  public static void main(String aa[]) throws Exception
  {
      File f1=new File("ABC.txt");
      FileReader fr=new FileReader(f1);
      BufferedReader br=new BufferedReader(fr);
      String word[]=null;
      int data[]=null;
      int d;
     int s;
int wc=0;
   while((s=br.readLine())!=null)
   {
	   word=s.split(" ");
	     wc=wc+word.length;
	     if(word%2==0)
	     {
       System.out.println("Even "+word);
			 }
			 else
			 {

       System.out.println("Odd "+word);
				 }
   }
       System.out.println(""+wc);


  }
}

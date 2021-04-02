import java.io.*;
class sai47copy
{
   public static void main(String args[]) throws Exception
   {
 	    BufferedReader br =new BufferedReader(new FileReader("tmp.txt"));
 	    
 	    BufferedWriter bw =new BufferedWriter(new FileWriter("cpy1.txt"));
 	    String s;
 	    while((s=br.readLine())!=null)
 	    {
 	        bw.write(s);
 	    }
 	    br.close();
 	    bw.close();
   }
}


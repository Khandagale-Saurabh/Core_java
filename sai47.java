import java.io.*;

class sai47
{
   public static void main(String args[])
   {

	   try{
     /*String f_name="t1.txt";
     FileWriter fw=new FileWriter(f_name); */
     BufferedWriter br=new BufferedWriter(new FileWriter("tmp.txt",true));
     br.write("Hello My name is saurabh ");
     br.newLine();
     br.write("I am writting on file");
     br.flush();
    br.close();
	   }catch(IOException e)
	   {
		    System.out.println(" "+e);
		   }
   }
}

import java.io.*;
class sai40
{
  public static void main(String sai[])
  {

     try{DataInputStream dis =new DataInputStream(System.in);
     FileOutputStream fis=new FileOutputStream("F2.txt");
     char ch;
    while((ch=(char)dis.read())!='#')
        {
	     	 fis.write(ch);
		 }
		 	          fis.close();}catch(Exception e){p.ptr(e);}

  }
}

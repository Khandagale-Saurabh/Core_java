import java.io.*;
class sai42
{
  public static void main(String sai[]) throws Exception
  {

    char ch;
    FileOutputStream fis=new FileOutputStream("F2.txt",true);
    DataInputStream dis=new DataInputStream(System.in);
    while((ch=(char)dis.read())!='#')
    {
		fis.write(ch);
		}


  }
}

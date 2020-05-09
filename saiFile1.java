import java.io.*;
class saiFile1
{
  public static void main(String aa[])
  {
       File f1=new File("C:/Users/saurabh/Desktop/AS1.txt");
       p.ptr(f1.getName());
       p.ptr(f1.getParent());
       p.ptr(f1.getPath());
       p.ptr(f1.getAbsolutePath());
       if(f1.exists()){p.ptr("true");}
       if(f1.canWrite()){p.ptr("true");}

       if(f1.canRead()){p.ptr("true");}
  }
}

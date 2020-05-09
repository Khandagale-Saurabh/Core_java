import java.io.*;
class sai34
{

	 public static void main(String aa[]) throws FileNotFoundException ,IOException,Exception
	 {
		 int input[]=new int[30];

int even[]= new int[20];

				int odd[]= new int[500];
    FileInputStream fis=new FileInputStream("C:/Users/saurabh/Desktop/AS1.txt");
int data;
        while(((data=fis.read())!=-1))
        {
		  if(data%2==0)
		  {
			    p.ptr((char)data+"EVEN");

			  }
			  else
			  {
				  p.ptr((char)data+"odd");
				  }
        }
	}

}

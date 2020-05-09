import java.io.*;
class saibuf1
{
   public static void main(String a[]) throws Exception
   {
       BufferedReader br=new BufferedReader(new FileReader("C:/Users/saurabh/Desktop/AS2.txt"));

        int data;
        int count=0;
        while((data=br.read())!=-1)
        {
			 if(s=='/0'))
			                 {
								 count++;
					 }
        System.out.print(""+(char)data );
        }
        String s;

        while((s=br.readLine())!=null)
        {
         System.out.println(""+s );
                 if(s.equals(" "))
                 {
					 count++;
					 }


	    }

         System.out.println("Spaces "+count );

   }
}

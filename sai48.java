import java.io.*;
import java.util.regex.*;
class sai48
{
   public static void main(String args[])
   {


      try{
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        p.ptr("Enter Name");
        String name=br.readLine();
        boolean b=Pattern.matches("[A-Za-z]{3,10}",name);
         if(b==true)
         {
			p.ptr("Name :"+name);
			 }
			 else
			 {
				 throw new StudentException();
				 }
				 p.ptr("Enter CGPA ");
		double cgpa=Double.parseDouble(br.readLine());
		if(cgpa<=0.0 &&cgpa>=10.0)
		   {
			    throw new StudentException();

			}
			else
			{
				p.ptr("Cgpa is : "+cgpa);
				}

                 p.ptr("Enter Enroll:  [BE[11-20][CSU|EEU|IT|ECS][1-250]]");
				String Enroll=br.readLine();
				boolean b2=Pattern.matches("[BE]{2}(1[1-9]|20)(CSU|EEU|IT|ECU)([1-9][1-8][0-9]9[0-9]|1[0-9]{2}|2[0-4][0-9]|250)",Enroll);
				if(b2==true)
				{
					p.ptr("Enroll is :"+Enroll);
					}
					else
					{
						throw new StudentException();
						}

               p.ptr("Enter passwword");
             String Pass=br.readLine();

               b2=Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})",Pass);
               if(b2==true)
               {
				   p.ptr("***********");
				   }
				   else
				   {
					   throw new StudentException();
					   }


	     }catch(Exception w)
	     {
			 p.ptr(""+w);
			 }

   }
}

class StudentException extends Exception

{
	StudentException()
	{
		super();

		}
		String toString(String s)
		{
			return "-------------------StudentException----------------------"+s;
			}

	}

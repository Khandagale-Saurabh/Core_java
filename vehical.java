import java.util.*;
import java.util.regex.*;
class vehical
{
   public static void main(String sai[]) throws Exception
   {
      Scanner  str=new Scanner(System.in);
      System.out.println("Enter Vehical Name");

     String name=str.next();
      System.out.println("Enter Vehical Regegestration");
      System.out.println("Enter state and  number");

      String data1=str.next();
        String pattern = "[MP|MH|AP|DL|GJ][0-9][0-9]";
       Pattern r = Pattern.compile(pattern);
       Matcher m = r.matcher(data1);
       if(m.find())
       {
		    System.out.println("Found value: " + m.group() );
		   }
		   else
		   {
			   throw new InavaildStateException();
			   }

      System.out.println("Enter Valid Formate");
			   String data2=str.next();
			   String pattern1 = "[A-Z][A-Z][0-9999]";
			          Pattern r1 = Pattern.compile(pattern1);
       Matcher m2 = r1.matcher(data2);
       if(m2.find())
	          {
	   		    System.out.println("Found value: " + m.group() );
	   		   }
	   		   else
	   		   {
	   			   throw new InavaildFormateException();
			   }
   }
}
class InavaildStateException extends Exception
{
	InavaildStateException()
	    {
		super();
		}
		String toString(String s)
		{
			return "You have Entered In valid State";
		}

}
class InavaildFormateException extends Exception
{
	InavaildFormateException()
	    {
		super();
		}
		String toString(String s)
		{
			return "You have Entered In valid Formate";
		}

}

import java.util.*;
class sai20 extends Exception
{
public static void main(String aa[])
{
   	try{
		 Scanner sc=new Scanner(System.in);
        	String a=sc.next();
   	if(a.length()!=10)
   	{
   	  throw new sai20();
   	}
   	}
   	catch(sai20 e)

   	{
   	 System.out.println(""+e);
   	}
}
}

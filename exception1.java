import java.util.*;
class exception1
{
  public static void main(String a[])
  {


	  try
	  {
     int num1=0,num2=0,ans=0;
     Scanner s=new Scanner(System.in);
     Scanner s2=new Scanner(System.in);
     System.out.println("num1 ");
     num1=s.nextInt();
     System.out.println("num2 ");
     num2=s2.nextInt();
     ans=num1/num2;
     System.out.println("Ans="+ans);

           try{
			   throw new Exception();
			   }
			   catch(Exception s1)
			   {
				   System.exit(1);
				   }
      }


      catch(ArithmeticException a1)
      {
		   System.out.println("Only integer   "+a1);
	  }
	  catch(InputMismatchException a2 )
	  {
		  System.out.println("Plz check ");
		 }
		 catch(Error e)
		       {
		 		  System.out.println("exception caught");
		 }
		  finally
		 	 		 {
		 	 			 System.out.println("We are in final block");
			 }



  }

}
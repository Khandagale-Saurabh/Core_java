import java.util.*;
class sai19
{
	 public static void prt(String  s)
	  {
	    System.out.println(s);
  	  }

 public void input()
	    	  {

	  	while(true){	 try
	  		{
	  		  Scanner sc= new Scanner(System.in);
	  		  int a;
	  		   int num=20;

	  		  a=sc.nextInt();
	  		  int ans=num/a;

	  	    }
	  	    catch(ArithmeticException e)
	  	    {
	  			prt("Divide by zero");
	  			}
	  			catch( InputMismatchException w )
	  			{
					prt("Inalid type");
					}
	  			}

}
  public static void main(String aa[])
  {
       sai19 s1=new sai19();
       s1.input();


	  }

}

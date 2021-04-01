import java.util.*;
class p1 extends Exception
{
	  public int a,b;
	 void read()
	 {

	  System.out.println("enter number only integer ");
      Scanner s=new Scanner(System.in);
	  a=s.nextInt();
	  System.out.println("enter number only integer");

	  b=s.nextInt();
     }

}
class p2
{
	public static void main(String aaa[])
	    {
			  p1 pp=new p1();


	       try
	       {
			    pp.read();
			}
			catch(Exception w)
			{
				System.out.println("Not calculate");
			}
			finally
			{
				}

		 }
}
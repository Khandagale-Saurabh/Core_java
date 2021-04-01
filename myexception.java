class myexception extends Exception
{
  public int mes;
     myexception(int a)
     {
       mes=a;


     }
}
class mydemo
{

  public static void main(String args[])
  {

          myexception e=new myexception(10);

          myexception e1=new myexception(100);



	      public void check(int a)
	       {
	           if(a>100) throw myexception
	           {
	                try
	                {
	                  System.out.println("In try block and above 100 number");
	                }
	                catch(Exception e)
	                {
	                   System.out.println("Inside catch");
	                }
	           }
	           else
	           {
	             System.out.println("  "+a);
               }
            }

  }
}

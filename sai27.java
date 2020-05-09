class p
{
  public static void ptr(String s)
  {
     System.out.println(s);
  }
   public static void ptr(int s)
    {
       System.out.println(s);
  }
  public static void ptr(Object s)
      {
         System.out.println(s);
  }
}
class sai27
{
	int val;
  public static void main(String aa[]) throws Exception
  {

	  sai27 obj[]=new sai27[5];
	  obj[0]=new sai27();
	  obj[0].val=10;
	  p.ptr(obj[0].val);

			 sai27 s[]=new sai27[10];
         for(int i=0;i<10;i++)
         {
			    s[i]=new sai27();
			   s[i].val=(int)(Math.random()*100);
			 //s[i].val=(int)(Math.random()*10);
			    p.ptr(s[i].val);
			 }


   					for(int i=5;i<=0;i--)
  						 {
							 System.out.println("*");
							 for(int j=i;j<=1;j--)
							 {
								 System.out.print("");
								 }
						   }
	  }
}

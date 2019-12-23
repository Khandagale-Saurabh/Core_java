class prime
{
	public static void main(String aa[])
	{
		int n=15;
		int m=n/2;
		 if(n==0||n==1)
		 {
			 System.out.println("Prime");
			 }
			 else
			 {
				 for(m=2;m<=n;m++)
				  {
					  if(n%m==0)
					   {

			               System.out.println("Prime");
						   }
						   else
						   {

			                      System.out.println("Not a Prime");
							   }
					 }
				 }
		}
}

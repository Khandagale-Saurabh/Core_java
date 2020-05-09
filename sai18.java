import java.util.*;
class sai16
{

   Scanner sc=new Scanner(System.in);
   public void input()
   {
       int a=sc.nextInt();
       if(a<0) throw new Exception;
   }


}
class sai17
{
	public static void main(String aa[])
 	{
		sai16 obj =new sai16();
		try{
		obj.input();
			}catch(Exception e)
			{
				System.out.println("exception areise");
				}
	 }

	}

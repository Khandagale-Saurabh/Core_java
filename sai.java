import java.util.*;
class sai<type>
{
	  type array[];
	   int data;
    int num=10;
    static final int size=10;
sai()
{
	this(size);
	}
sai(int a)
{
	  array =(type[])new Object[200];
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter data");


	     for(int i=0;i<=array.length-1;i++)
	         {
	  		   array[i]=10;
	         }
	          for(int i=0;i<=array.length-1;i++)
			 	         {

			 	          System.out.println("Array"+array[i]);
			 	         }


}
 public void input()
 {

   }
   public static void main(String aaaaa[])
   {
      sai<Integer> s1=new sai<Integer>(10);
      s1.input();
   }
}

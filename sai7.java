import java.lang.*;
import java.util.*;
class sai7
{
	public static void main(String aaa[])
	{int a[]={10,20,30,40,50,60};
	 int b[]=new int [a.length];
	 System.arraycopy(a,0,b,0,a.length);

          if(a.equals(b))
          {
			  System.out.println("Same");
			  }
			  else
			  {

			  System.out.println("NOT_Same");
				  }


			  System.out.println("-------------------------------");
				  for(int i=0;i<a.length;i++)
				  {
					  System.out.println("Array1 "+a[i]);
					  }

			  System.out.println("-------------------------------");
					  				  for(int i=0;i<b.length;i++)
					  				  {
					  					  System.out.println("Array2 "+b[i]);
					  }


					      int c[]= a.clone();
					      	  for(int i=0;i<c.length;i++)
					  				  {
					  					  System.out.println("Array1 "+c[i]);
					  }
					int p=Arrays.binarySearch(a,60);


					  					  System.out.println("BinarySerach()  "+p);
    }
}

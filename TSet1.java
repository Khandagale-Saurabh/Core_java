import java.util.*;
class TSet1
{
  public static void main(String aa[]) throws Exception
  {
     TreeSet<Integer> t1=new TreeSet<Integer>(new MysComp());
    t1.add(20);
    t1.add(11);t1.add(56);t1.add(30);
    System.out.println(""+t1);
  }
}
class MysComp implements Comparator
{
	  public int compare(Object o1,Object o2)
	  {
		    int i=(Integer)o1;
		    int j=(Integer)o2;
		    if(i<j)
		    {
				return -1;
				}
				else if(i>j)
				{
					return 1;
					}else
					{
						return 0;
						}
		  }
	}

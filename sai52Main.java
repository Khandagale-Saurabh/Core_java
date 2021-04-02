import java.util.*;


class Mycompare implements Comparator<String >
{
   public int compare(String o1,String o2)
   {
          return o1.compareTo(o2);
   }
}
class sai52Main
{
   public static void main(String aaa[])
   {
     ArrayList<String> a=new ArrayList<String>();
       a.add("A");
       a.add("B");
       a.add("C");

       Collections.sort(a,new Mycompare());
       for(String  s:a)
       {
          System.out.print(" "+s);
       }


   }
}

import java.util.*;
class emp
{

  String name;
  int age;
  double salary;
  emp(String n,int ag,double sa)
  {
    name=n;
    age=ag;
    salary=sa;
  }
}
class comp implements Comparator<emp>
{
    public int compare(emp e1,emp e2)
    {
       if(e1.age==e2.age)
       {
           return 1;
       }
       else
       {
		   return 0;
		   }

    }
}
class sai51
{
	public static void main(String ap[]){
   ArrayList=new ArrayList();

   n.add(new emp("Saurabh",11,22.2));
    n.add(new emp("Burabh",22,21.2));
    //Collections.sort(n,new comp());
    for(emp e:n)
    {
		   System.out.print(" "+e.age);
		}

   }
}

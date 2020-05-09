import java.util.*;
class student  implements  Comparable
{
    String name;

   student(String name)
   {
	   this.name=name;
	   }
 //   int age;
    public String getname()
    {
        return name;
    }
    public void setname(String s)
    {
    name=s;
    }

     int compareTo(student s)
     {
		 int l1=(student)s.length();
		 int l2= this.name;
		 if(l1>l2)
		 {
			  return l1;
			 }
			 else
			 {
				 return l2;
				 }

		 }

}
class sai56
{
   public static void main(String aaa[])

   {

       ArrayList<student> arr1=new ArrayList<student>();
         arr1.add(new  student("Saurabh"));
         arr1.add(new student("Sahil"));
         arr1.add(new  student("Arpit"));
         p.ptr("ArrayList "+arr1);

        for(student o: arr1)
        {
			System.out.print("  "+o);
			}
   }
}

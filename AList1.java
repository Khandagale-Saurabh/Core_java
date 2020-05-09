import java.util.*;
class Student
{
 String name;
 int roll;

   public void  setName(String s)
   {
	   name=s;
   }


   public void  setRoll(int s)
   {
	   roll=s;
   }


   public int getRoll()
   {
	   return roll;
   }
   public String getName()
   {
	    return name;
	   }
}
class AList1
{
   public static void main(String a[])
   {
      Student s1=new Student();

       Student s3=new Student();
      Student s2=new Student();
      s1.setName("Saurabh");
      s2.setName("Sahil");
      s3.setName("Arpit");
      s1.setRoll(10);
      s2.setRoll(20);s3.setRoll(30);

    ArrayList<Student> a1=new ArrayList<Student>();

    a1.add(s1);
    a1.add(s2);
    a1.add(s3);
     for(Student ss:a1)
       {
		   System.out.print(""+ss.name);

		   System.out.print("  "+ss.roll);


		    System.out.println();




		}

				    System.out.println("---------------------");


   ArrayList<Student> a4=new ArrayList<Student>();
   a4.add(s1);
  a4.add(s2);
a4.add(s3);

 for(Student ss:a4)
       {
		   System.out.print(""+ss.name);

		   System.out.print("  "+ss.roll);


		    System.out.println();




		}
   }
}
class Mycomp1 implements Comparator
{
      public int compare(Object o1,Object o2)
      {
          Student s1=(Student)o1;
          Student s2=(Student)o2;
          if(s1.getRoll()>s2.getRoll())
          {
              return -1;
          }
          else if(s1.getRoll()<s2.getRoll())
          {
              return 1;
          }
          else
          {
               return 0;
          }
      }
}

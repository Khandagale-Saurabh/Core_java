class Student
{
	String s;
	int r;
     Student (String s,int r)
     {
        this.s=s;
        this.r=r;
     }
    public  String toString()
     {
     return (" roll "+r);
     }
}
class AR
{
   public static void main(String aaa[])
   {
        Student s1=new Student("RAM",10);

        Student s2=new Student("ShRAM",30);
        Student s3=new Student("DHARAM",10);
         Student a1[]=new Student[4];
         a1[0]=s1;
         a1[1]=s2;
         a1[3]=s3;
       for(Student s: a1)
       {
       System.out.println(s);
       }
   }
}

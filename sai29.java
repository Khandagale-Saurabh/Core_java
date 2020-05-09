class p
{
  public static void ptr(String s)
  {
     System.out.println(s);
  }
   public static void ptr(int s)
    {
       System.out.println(s);
  }
  public static void ptr(Object s)
      {
         System.out.println(s);
  }
}
class sai28super
{

   sai28super(String s)
   {p.ptr("INSIDE SUPER()"+s);
	   }


	}
class sai28 extends sai28super
{
   int roll,salary;
   String name;
   sai28()
   {
	   super("Hello");
	    p.ptr("inside constructor of default sai28()");
   }


   sai28(String s)
      {
		  this();

   	    p.ptr("inside constructor of  sai28(Parametrized )");
   }

   public void setdata(int roll,int salary,String name)
   {

   this.roll=roll;
   this.name=name;
   this.salary=salary;
   }
   public void display()
   {
     p.ptr(roll);
     p.ptr(name);
     p.ptr(salary);
   }
}

class sai29
{
   public static void main(String aa[])
   {
     sai28 obj=new sai28("Sai");
     obj.setdata(20,20000,"RAM");
     obj.display();
     obj.setdata(10,4000,"SRAM");

     obj.display();
   }
}

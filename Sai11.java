class A
{
  int n1=10;
  A()
  {
     n1=100;

   System.out.println(" IN A() constnt  "+ n1);
  }
   public void m1()
   {
   System.out.println("\ninside m1()");
   }
}
class B extends A
{
  int b;
  B()
  {
    b=20;

   System.out.println("\n IN B() "+b);
  }
   public void m1()
   {
   System.out.println("\n B of inside m1()");
   }
}

class C extends A
{
  int c;
  C()
  {
    c=20;

   System.out.println("\n IN B() "+c);
  }
   public void m1()
   {
   System.out.println("\n C of inside m1()");
   }
}

class Sai11
{
  public static void main(String aa[])
  {
   //Sai11 s=new Sai11();
     /* B  o1=new B();
      o1.m1();
      o1.m2(); */
      A a=new B();
      a.m1();
      A c=new C();
      c.m1();
  }
}

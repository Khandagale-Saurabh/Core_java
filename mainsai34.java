package p3;
class sai34
{
	public void rr()
	{
		 System.out.println("Hello friends chi pi lo");
	}
}
class der34 extends sai34
{
   int aa;
	public void display()
	{
		System.out.println("Inside display");
	}
              public void red(int a)
        {
                  aa=a;
        System.out.println("AA "+aa);                
        }

}

class mainsai34
{
	public static void main(String ss[])
	{
	   sai34 s=new sai34();
	   s.rr();
	   der34 d=new der34();
	   d.display();
	   d.rr();
                d.red(33);
              }
}
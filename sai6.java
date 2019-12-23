class rect
{
  private double width,height;
  public rect()
  {
	  double a;
	  System.out.print("Inside constructor");
	  width=10;
	  height=10;
	  a=width*height;

	  System.out.println("Area is "+a);

  }
  public rect(int h,int w)
    {
  	  double a;
  	  System.out.print("Inside Argu_constructor");

  	  a=this.area(h,w);

  	  System.out.println("Area is "+a);

  }
  public double area(int w,int h)
  {


	   return w*h;
	  }




}
class sai6
{
	public static void main(String ar[])
	  {
		  rect obj=new rect();
		  rect obj2=new rect(50,50);

		  }
	}

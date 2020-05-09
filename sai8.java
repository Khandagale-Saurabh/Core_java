interface Vehical
{
  public void window();
  public void ac();
}
class Car implements Vehical
{
    public void ac()
    {
		System.out.println("---------------");
	}
	public void window()
	{
			System.out.println("--------****-------");
	}
}

class sai8
{
   public static void main(String aa[])
   {
	   Car c=new Car();
	   c.ac();
	   c.window();
   }
}

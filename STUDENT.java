interface test
{
  public    void getTest1Marks(int a);

  public void getTest2Marks(int b);
}
interface Assignment
{
	public void getAssignment1Marks(int c);

	public void getAssignment2Marks(int d);
	}
class student
{
  public String name="ghw";
  public int roll=90;

}
class Internal extends student implements test,Assignment
{


	public int M1,M2,M3,M4;

	public  void getTest1Marks(int m1)
	 {
		 M1=m1;

		 }

   public   void getTest2Marks(int m2)
    {
		M2=m2;
		}



			public void getAssignment1Marks(int m3)
			{
				M3=m3;
				}

	public void getAssignment2Marks(int m4)
		{
			M4=m4;
			}

			public void Display()
			{


				System.out.println("Student NAme:-"+name);
				System.out.println("M1"+M1);

				System.out.println("M1"+M2);
				System.out.println("M1"+M3);
				System.out.println("M1"+M4);





				}

public static void main(String aaa[])
{

	Internal i=new Internal();

	i.getAssignment1Marks(20);

	i.getAssignment2Marks(50);
	 i.getTest1Marks(70);

    i.getTest2Marks(40);
}

}

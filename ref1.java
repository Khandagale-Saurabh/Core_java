class ref1
{
	int x,y;
	public static void main(String aaaa[])
	{
		ref1 a=new ref1();
		a.x=10;
		ref1 b=new ref1();
		b.y=20;
		swap(a,b);
		System.out.println(" "+a.x+" "+b.y);
	}
	static void swap(ref1 o1,ref1 o2)
	{
		int temp;
		temp=o1.x;
		o1.x=o2.y;
		o2.y=temp;
		}
}

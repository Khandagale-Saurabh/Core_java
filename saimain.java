interface i1
{
	public void m1();
	}
	interface i2
	{
		public void m2();

		}

		class sai17 implements i1,i2
		{
			public void m1()
			{
				System.out.println("m1 access");
				}
				public void m2()
							{
								System.out.println("m2 access");
				}

			}
			class saimain1
			{
				 public static void main(String aa[])
				 {
					 sai17 s1=new sai17();
					 s1.m1();
					 s1.m2();
					 }
				}

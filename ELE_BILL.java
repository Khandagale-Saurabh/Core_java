import java.util.*;
class ELE_BILL
{
int unit;
String name;
double amt=0;
   public void input()
   {
     Scanner sc=new Scanner(System.in);
     Scanner ss=new Scanner(System.in);
     p.ptr("Enter name");
      name=ss.nextLine();
     p.ptr("Enter Unit");
      unit=sc.nextInt();


   }
   public void counter()
   {
	   if(unit<=100)
	      {
			  p.ptr("CUSTUMBER "+name);
			  p.ptr("BILL is RS: 500 ONLY");
		   }
		   else if(unit>=101 &&unit <=600)
	        {

			  p.ptr("CUSTUMBER "+name);
				amt=amt+unit*2.36;
				p.ptr("BILL is RS: "+amt +"ONLY");

				}
				else if(unit>=601&& unit >=2000)
				{

			  p.ptr("CUSTUMBER "+name);
					amt=amt+unit*3.5;

				p.ptr("BILL is RS: "+amt +"ONLY");
					}

					else if(unit>=2001)
					{

			  p.ptr("CUSTUMBER "+name);
						amt=amt+unit*5.09;

				p.ptr("BILL is RS: "+amt +"ONLY");
					}
	   }


public static void main(String aaa[])
{
	ELE_BILL b=new ELE_BILL();
	b.input();
	b.counter();
}


}


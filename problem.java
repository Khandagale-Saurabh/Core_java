import java.io.*;
class problem
{

  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();

 if(n>=1 || n<=100)
 {
  if(n%2==0)
    {
       if(n>=2 && n<=5)
       {
       System.out.println("Not Weird");
       }
       if(n>=6 &&n<=20)
       {
       System.out.println("Weird");
       }

    }

 }
else
 {
  System.out.println("Out of bound");
 }
}
}

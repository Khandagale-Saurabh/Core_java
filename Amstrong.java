class Amstrong
{
  public static void main(String aa[])
  {
     int n=371;
     int sum=0;
        int t=n;
          int r1,r2,r3;
            r1=n%10;//1
                       System.out.println(""+r1);
              sum=sum+r1*r1*r1;
            n=n/10;//37

		               System.out.println(""+n);

           r2=n%10;//7
                 sum=sum+r2*r2*r2;
                        System.out.println(""+r2);
            n=n/10;//1

                          System.out.println(""+n);
            r3=n%10;//1
               sum=sum+r3*r3*r3;
/*
                          System.out.println(""+r3);

                          n=n/10;

                           System.out.println(""+n);  */

            System.out.println(" R1 "+r1+ " R2 " + r2+ " R3 "+r3);
System.out.println("Sum "+sum);//21

         if(t==sum)
             {
           System.out.println("Yes it is amstrong number");
            }
         else
            {
            System.out.println("NO it is amstrong number");

          }
  }
}

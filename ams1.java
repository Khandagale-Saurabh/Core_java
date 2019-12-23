class ams1
{
   public static void main(String aa[])
   {
      int num=371;
      int t=num;
      int sum=0;
         int r1,r2,r3;
         r1=num%10;//7
         num=num/10;//13
         sum=sum+r1*r1*r1;//sum=7*7*7

         System.out.println("Sum "+sum);
         r2=num%10;//3
         num=num/10;//1
         sum=sum+r2*r2*r2;//

         r3=num%10;
         sum=sum+r3*r3*r3;

         System.out.println("Sum "+sum);

         //System.out.println(" "+num);

         System.out.println(" "+t);

         if(t==sum)
         {
         System.out.println("yes");
         }else
         {
         System.out.println("no");

         }

   }
}

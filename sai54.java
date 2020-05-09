class sai54
{
   public static void main(String aa[])
   {
       Print.display(20);
   }

}
class Print
{
   public static <T> void display(T data)
   {
      p.ptr(" "+data.getClass().getName());
      p.ptr(" "+data);
   }
}

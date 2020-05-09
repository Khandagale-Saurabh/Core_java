class sai53
{
   public static void main(String aa[])
   {
       Gen<Integer> o=new Gen<>(20);
       p.ptr(""+o.get());
       Gen<String> o1=new Gen<>("Saurabh :-String");
       p.ptr(""+o1.get());

   }
}
class Gen<T>
{
   T obj;
      Gen(T obj)
      {
         this.obj=obj;
      }
     public T get()
     {
        return this.obj;
     }
}

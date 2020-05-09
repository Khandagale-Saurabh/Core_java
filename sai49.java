class gen2<T,V>
{
    T t;
    V v;
     gen2(T t,V v)
     {
        this.t=t;
        this.v=v;
     }
     T get()
     {
        return t;
     }
     V getV()
     {
         return v;
     }

   public <T >void add(T a, V b)
        {
			p.ptr("Sum :"+a+b);

	    }
  public void display()
  {
     p.ptr("OBJ1 :"+t +"OBJ2 :"+v);
  }
}
class sai49
{
    public static void main(String aaaaa[])
      {
                 gen2<String,String> g1=new gen2<>("Rcoem","CSU");
                 g1.display();
      }
}

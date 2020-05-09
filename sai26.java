class sai
{
   public static void ptr(String s)
   {
   System.out.println(s);
   }

 public static void ptr(int s)
   {
   System.out.println(s);
   }
    public static void ptr(Double s)
      {
      System.out.println(s);
   }


}
class Publisher
{
  String title;
   double isbn;
   double price;
   String Auther;
   Publisher(String title,double price,double isbn,String Auther)
   {
      Auther=this.Auther;
      price=this.price;
      isbn=this.isbn;
      title=this.title;
   }
   public void display()
   {
      sai.ptr(Auther);
      sai.ptr(title);
      sai.ptr(isbn);
      sai.ptr(price);
   }
}
class Book extends Publisher
{
  int pageno;
  int edition;
    Book(int pageno,int edition,String title,double price,double isbn,String Auther)
    {
       pageno=this.pageno;
       edition=this.edition;

	         Auther=this.Auther;
	         price=this.price;
	         isbn=this.isbn;
      title=this.title;
    }
    public void display()
       {
          sai.ptr(pageno);
          sai.ptr(edition);

   }
}
class sai26
{
  public static void main(String aa[])
  {
    //Publisher p=new Publisher("JAVA",120.1,20.0,"Sai");
    Book b=new Book(10,1,"Java",2.2,3.3,"XYZ");
    b.display();
  }
}

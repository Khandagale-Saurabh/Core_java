import java.util.LinkedList;
import java.util.*;

class Book
{
   int id;
   String name;
   String author;
    Book(int id,String name,String author)
    {
     this.id=id;
     this.name=name;
     this.author=author;
    }
}
class LinkedList2
{
  public static void main(String aa[])
  {
    Book b1=new Book(1,"Java","Saurabh");

    Book b2=new Book(2,"C","Juhi");
    Book b3=new Book(4,"C++","Manish");
    Book b4=new Book(3,"Java","Abhi");
    LinkedList<Book> l1=new LinkedList<>();
     l1.add(b1);
     l1.add(b2);l1.add(b3);l1.add(b4);

     ListIterator<Book> t=l1.listIterator();
     while(t.hasNext())
     {
		 Book b=t.hasNext();
		 }

  }
}



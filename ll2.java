class Main
{
  public static class Node
  {
   Node next;
    int data;
  }
  public static class LL
  {
       Node head,tail;
       int size;

      public void addlast(int num)
         {
              Node node=new Node();
              node.next=null;
              node.data=num;
            if(size==0)
             {
			 head=tail=node;
			 }
			 else
			 {
			   tail.next=node;
			   tail=node;
			 }
			 size++;
         }

      public void display()
      {
		  Node temp=head;
		  while(temp!=null)
		  {
			  System.out.println(temp.data+" "+size);
			  temp=temp.next;
			  }
		  }

		  public void removefirst()
		  {
			  Node temp=head;
			  temp=temp.next;
			  head=temp;
			  //temp=null;
			  size--;
		  }
		  public void addfirst(int num)
		  {
			  Node n1=new Node();
			  n1.data=num;
			 if(size==0)
		       {
				   head=tail=n1;
			   }
			   else
			   {
				   n1.next=head;
				   head=n1;
			   }

		  }

		  public int getAt(int pos_data)
		  {
			  Node temp=head;
			  int pos=0;
			  while(pos+1!=pos_data)
			  {
				  temp=temp.next;
				  pos++;
			  }
			  return temp.data;
	      }
  }
  public static void main(String aa[])
  {
    Main m1=new Main();
    LL l1=new LL();
    l1.addfirst(1);
   l1.addlast(20);


     l1.addlast(30);
      l1.addlast(40);
      int dd=l1.getAt(2);

      System.out.println("Pos"+dd);

  }
}


/*
l1.display();

      System.out.println("-------------");
    l1.removefirst();
    l1.display();

      System.out.println("-------------");
 l1.removefirst();
    l1.display();

        System.out.println("-------------");
   l1.removefirst();
    l1.display();

	      System.out.println("-------------");
	l1.addfirst(11);
  l1.display();
  */

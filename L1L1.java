class LL1
{
  public static class Node
  {
    int data;
    Node next;
  }
  public   static class LinkedList
  {
     Node head,tail;
     int size;
        public  void addLast(int data)
        {
         Node node=new Node();
         node.data=data;
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
              System.out.println(" "+temp.data);
              temp=temp.next;
           }
              System.out.println(" .");

        }
        public int size()
		        {
					int count=0;
		           Node temp=head;
		           while(temp!=null)
		           {
					   count++;
		             // System.out.println(" "+temp.data);
		              temp=temp.next;
		           }
		             // System.out.println(" .");
		             return count;

        }
  }

    public static void main(String aa[])
    {
      LinkedList l1=new LinkedList();
      l1.addLast(10);
      l1.addLast(20);
      l1.display();
    }
}

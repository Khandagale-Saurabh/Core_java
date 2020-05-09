class stack
{
	   int top;
	   int stk[]=new int[10];
	   stack()
	   {

		   top=0;
		   }
	    void push(int item)
	    {
			 if(top==10)
			 {

				             System.out.println("full");

			 }else{
				   stk[++top]=item;
				      System.out.println(""+item);
				 }


		}
		int pop()
	    {
			return stk[top--];
			}
	}
	class sai14
	{
		public static void main(String aa[]){

      stack s1=new stack();
      s1.push(10);
      System.out.println(""+s1.pop());}

    }

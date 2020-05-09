class Box
{
  int height,width,dp;
     Box(int h,int w,int d)
     {
      height=h;
      width=w;
      dp=d;
     }

     int vol()
     {
        return height*width*dp;
     }
     void display()
     {
        System.out.println(""+height);

        System.out.println(""+width);
        System.out.println(""+dp);
     }

}
class sai13
{
  public static void main(String aa[])
  {
      Box ob1=new Box(10,20,30);
      ob1.display();
      int v=ob1.vol();

        System.out.println(""+v);
  }
}

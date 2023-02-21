class baseclass
{
int i=50;
}
class deriveclass extends baseclass
{
  int i=60;
  void disp()
  {
    System.out.println("The i value in base class is:"+super.i);
    System.out.println("The i value in derive class is:"+i);
  }
}
class Super 
{
  public static void main(String args[])
  {
    deriveclass d1=new deriveclass();
    d1.disp();
  }
}
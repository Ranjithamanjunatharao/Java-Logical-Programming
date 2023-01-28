import java.util.Scanner;
 
class Addition 
{
  int c;
   int add(int a,int b)
   {
     c=a+b;
     return c;
   }
}
class addit
{
  public static void main(String args[]) 
  {
    int x,y,z;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter a,b values:");
     x=sc.nextInt();
     y=sc.nextInt();
      Addition a1=new Addition();
      z=a1.add(x,y);
    System.out.println("The Adddition value is:"+z);
    
  }
}
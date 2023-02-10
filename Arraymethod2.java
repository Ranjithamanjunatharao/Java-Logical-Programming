import java.util.Scanner;
class Arraymethod3{
  int i,n;
  void arr(int a[])
  {
     System.out.println("The elements in the Array are:");
    for(i=0;i<a.length;i++){
      System.out.print("\t"+a[i]);
      }
  }
}
class Arraymethod2{
  public static void main(String args[])
  {
    int i,n;
    Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of n:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements");
    for(i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    
      Arraymethod3 a1=new Arraymethod3();
      a1.arr(a);
    
  }
}
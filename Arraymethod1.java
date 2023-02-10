import java.util.Scanner;
class Arraymethod2{
   void arr()
  {
 Scanner sc=new Scanner(System.in);
    int i,n;
    System.out.println("Enter the value of n:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("The elements in the Array are:");
    for(i=0;i<n;i++){
       System.out.print("\t"+a[i]);
      }
  }
}
class Arraymethod1{
  public static void main(String args[])
  {
Arraymethod2 a1=new Arraymethod2();
    a1.arr();   
  }
}
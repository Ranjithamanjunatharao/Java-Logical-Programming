import java.util.Scanner;
class Arraymethod4{
  int[] arr(int a[]){
    //int i,m[]={};
   // for(i=0;i<x.length;i++){
     // m[i]=x[i];
    //}
    return a;
  }
}
class Arraymethod3{
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
      Arraymethod4 a1=new Arraymethod4();
     int p[]= a1.arr(a);
    System.out.println("The elements in the Array are:");
    for(i=0;i<a.length;i++){
      System.out.print("\t"+p[i]);
      }
  }
}
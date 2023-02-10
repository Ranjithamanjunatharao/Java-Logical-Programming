//JAVA program to delete an element from an array at specified position.
import java.util.Scanner;
class Deletearray{
  public static void main(String args[]){
    int n,pos,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements of an Array");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
      System.out.println("Enter a array index position to be deleted");
      pos=sc.nextInt();
    System.out.println("After deletion of an element in an Array");
      for(i=pos;i<n-1;i++)
        {
         a[i]= a[i+1];
        }
      n=n-1;
      for(i=0;i<n;i++){
        System.out.println(a[i]+" ");
      }
  }
}
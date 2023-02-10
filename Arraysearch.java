//Searching of element in an array
import java.util.Scanner;
class Arraysearch
{
  public static void main(String args[])
  {
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements in an Array:");
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter the search element in an Array:");
    int ser=sc.nextInt();
    for(i=0;i<n;i++)
    {
    if(ser==a[i])
    {
      System.out.println(ser+" is found ");
      break;
    }
    }
      if(i==n){
        System.out.println(ser+" not found "); 
      }
  }
}
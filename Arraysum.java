//Sum of the Array
import java.util.Scanner;
class Arraysum{
  public static void main(String args[]){
    int i,n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n=sc.nextInt();
    System.out.println("Enter the elements in an array");
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("The elements in an array is:");
    for(i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
    for(i=0;i<n;i++)
    {
     sum=sum+a[i];
    }
    System.out.println("The sum of an array is:"+sum);
    }
  }

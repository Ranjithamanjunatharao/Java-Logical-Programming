//Array of n numbers
import java.util.Scanner;
  class Arrayn{
  public static void main(String args[])
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
  
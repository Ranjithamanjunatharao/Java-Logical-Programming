import java.util.Scanner;
class Dupli{
  public static void main(String args[])
  {
    int n,i,j=0;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array size:");
    n=sc.nextInt();
    int a[]=new int[n];
     System.out.println("Enter the Duplicate elements in an array:");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Elements after removing Duplicate elements are:");
    for (i= 0;i<n;i++)
    {
      if(a[i]!=a[j]) {
        a[++j]=a[i];
      }
    }
    for(i= 0;i<=j;i++) {
System.out.print(a[i] + " ");
}
  }
}




import java.util.Scanner;
class countdup{
  public static void main(String args[])
  {
    int n,i,j,count=0;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array size:");
    n=sc.nextInt();
    int a[]=new int[n];
     System.out.println("Enter the Duplicate elements in an array:");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
   for (i=0;i<n;i++) 
    {
      for (j=i+1;j<n;j++)
      {
      if(a[i]==a[j]) 
      {
        count++;
        break;
      }
    }
    }
      System.out.println("The count of duplicate elements is:"+count);
    }
}


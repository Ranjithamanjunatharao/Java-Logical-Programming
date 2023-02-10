import java.util.Scanner;
class firstmaxsecondmax
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int max1,max2,i,n;
    System.out.println("Enter the array size: ");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the array elements: ");
    for(i=0;i<n;i++)
    {
    a[i]=sc.nextInt();
  }
     max1=max2=0;
    for(i=0;i<n;i++)
      {
        if(a[i]>max1)
        {
          max2=max1;
          max1=a[i];
        }
        if(a[i]>max2 && a[i]!=max1)
          {
          max2=a[i];
      }
      }
System.out.println("The first largest value is:"+max1);
System.out.println("The second largest value is:"+max2);    
  }
}
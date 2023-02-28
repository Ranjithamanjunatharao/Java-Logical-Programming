import java.util.*;
class Selection
  {
    int i,j,t,n;
    Scanner sc=new Scanner(System.in);
    void getArray(int a[],int n)
    {
      for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    }
    void dispArray(int a[],int n)
    {
      for(i=0;i<n;i++){
      System.out.println(" "+a[i]);
    }
    }
    void Selectionsort(int a[],int n)
    {
      for(i=0;i<n-1;i++)
    {
     for(j=i+1;j<n;j++)
     {
      if(a[i]>a[j]){
        t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
  }
    }
    
  }
class Selectionsortmethod
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Selection s1=new Selection();
      int n,i,j,t;
      System.out.println("Enter Array size:");
    n=sc.nextInt();
    int a[]=new int[n];
     System.out.println("Enter the elements in size:");
      s1.getArray(a,n);
      System.out.println("Elements before sorting:");
      s1.dispArray(a,n);
       System.out.println("Elements after sorting");
      s1.Selectionsort(a,n);
      s1.dispArray(a,n);
    }
  }
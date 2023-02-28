import java.util.*;
class Bubble
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
    void Bubblesort(int a[],int n)
    {
      for(i=0;i<n-1;i++)
    {
     for(j=0;j<n-1-i;j++)
     {
      if(a[j]>a[j+1]){
        t=a[j];
        a[j]=a[j+1];
        a[j+1]=t;
      }
    }
  }
    }
    
  }

class Bubblemethod
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bubble b1=new Bubble();
      int n,i,j,t;
      System.out.println("Enter Array size:");
    n=sc.nextInt();
    int a[]=new int[n];
     System.out.println("Enter the elements in size:");
      b1.getArray(a,n);
      System.out.println("Elements before sorting:");
      b1.dispArray(a,n);
       System.out.println("Elements after sorting");
      b1.Bubblesort(a,n);
      b1.dispArray(a,n);
    }
  }
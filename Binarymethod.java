import java.util.*;
class Binary
  {
    Scanner sc=new Scanner(System.in);
    int i,key;
    void getArray(int arr[],int n,int beg,int end,int mid)
    {
      for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
  }
    void dispArray(int arr[],int n,int beg,int end,int mid)
    {
      for(i=0;i<n;i++)
      {
        System.out.print("\t"+arr[i]);
      }
    }
    void Binarysearch(int arr[],int n,int key,int beg,int end,int mid)
    {
      
       
      while(beg<=end)
      {
        if(arr[mid]<key)
        {
          beg = mid + 1;
        }
        else if(arr[mid] == key)
        {
            System.out.println("\nElement is Found!position of the element is"+mid+1);
          break;
        }
        else
        {
            end= mid-1;
        }
        mid = (beg+end)/2;
      }
      if(beg>=end)
        System.out.println("Element is not Found");
    }
  }

class Binarymethod
  {
    public static void main(String args[])
    {
    Binary bs=new Binary();
      
      Scanner sc=new Scanner(System.in);
      int n,key,i;
      System.out.println("Enter Array Size:");
      n=sc.nextInt();
      int arr[]=new int[n]; 
      int  beg=0;
     int  end = arr.length-1;
      int mid = (beg+end)/2;

    System.out.println("Enter Elements to Array:");
      bs.getArray(arr,n,beg,end,mid);
       System.out.println(" Elements in an Array is :");
      bs.dispArray(arr,n,beg,end,mid);
      System.out.println("\nEnter the key element");
      key=sc.nextInt();
    bs.Binarysearch(arr,n,key,beg,end,mid);  
    }
  }
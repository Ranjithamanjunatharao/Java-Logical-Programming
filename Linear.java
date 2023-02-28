import java.util.*;
class Linear1 {
  int i;
  Scanner sc = new Scanner(System.in);
  void getArray(int a[], int n)
  {
    for (i = 0; i < n; i++)
    {
      a[i] = sc.nextInt();
    }
  }
  void dispArray(int a[], int n)
  {
    for (i = 0; i < n; i++)
    {
      System.out.print("\t" + a[i]);
    }
  }
  //void linsearch(int a[],int n,int ser)
  Boolean linsearch(int a[],int n,int ser)
  {
    boolean b=true;
    for (i = 0; i < n; i++)
    {
      if (a[i] == ser)
      {
        //System.out.println("Element is Found at position " + (i + 1));
        b=true;
        break;
      }
    }
    if (i == n)
    {
      b=false;
      //System.out.println("Element is Not Found");
    }
    return b;
  }
}
class Linear {
  public static void main(String args[]) {
    int n, i, ser;
    Boolean bool;
    Linear1 ln = new Linear1();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size:");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter Elements to Array:");
    ln.getArray(a, n);
    System.out.println("The Elements in an Array is:");
    ln.dispArray(a,n);
    System.out.println("\nEnter Element for Search:");
    ser = sc.nextInt();
    //ln.linsearch(a,n,ser);
   bool= ln.linsearch(a,n,ser);
    System.out.println("Element is found "+bool);
  }
}


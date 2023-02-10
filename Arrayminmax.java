import java.util.Scanner;
class Arrayminmax{
  public static void main(String args[]){
    int i,n,min,max;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    n=sc.nextInt();
      int a[]=new int[n];
    System.out.println("Enter the elements in an array");
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
       }
   System.out.println("The elements in an array is");
    for(i=0;i<n;i++){
    System.out.println(a[i]);
       }
    //for(int b:a){
      //System.out.println(b);
    //}
    min=max=a[0];
    for(i=0;i<n;i++){
    if(a[i]>max){
      max=a[i];
    }
    if(a[i]<min){
      min=a[i];
    }
    }
     System.out.println("The minimum value is:"+min);
    System.out.println("The maximum value is:"+max);
  }
}
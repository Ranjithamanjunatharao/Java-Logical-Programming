import java.util.Scanner;
class max3switch
  {
    public static void main(String args[])
    {
      int a,b,c,max;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the 3 values");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      max=0;
      if(a>max){
        max=a;
      }
       if(b>max){
        max=b;
      }
       if(c>max){
        max=c;
      }
       System.out.println(max);
    }
  }
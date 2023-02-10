import java.util.Scanner;
class Reversestring{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String st1=sc.next();
    StringBuffer st2=new StringBuffer(st1);
    System.out.println("The Reverse of the given String is:"+st2.reverse());
  }
}


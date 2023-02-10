import java.util.Scanner;
class Substring1{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String st1=sc.nextLine();
    System.out.println("Enter the first index position for substring");
    int s=sc.nextInt();
    System.out.println("Enter the last index position of substring");
    int e=sc.nextInt();
    System.out.println("The sub String is: "+st1.substring(s,e-1));
  }
}
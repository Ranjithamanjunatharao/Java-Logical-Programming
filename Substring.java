import java.util.Scanner;
class Substring{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String st1=sc.nextLine();
    System.out.println("Enter the index position for substring");
    int s=sc.nextInt();
    System.out.println("The length of the given String is: "+st1.substring(s));
  }
}
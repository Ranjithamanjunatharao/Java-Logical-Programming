import java.util.Scanner;
class Touppercase{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string in lower case");
    String st1=sc.nextLine();
    System.out.println("The uppercase of given string is: "+st1.toUpperCase());
  }
}
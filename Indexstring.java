import java.util.Scanner;
class Indexstring{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String st1=sc.nextLine();
    System.out.println("Enter the character to get the index");
    char ch=sc.next().charAt(0);
    System.out.println("The index of the given character is: "+st1.indexOf(ch));
  }
}
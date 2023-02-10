import java.util.Scanner;
class CharacterString{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String st1=sc.nextLine();
    System.out.println("The 4th character of the given String is: "+st1.charAt(4));
  }
}
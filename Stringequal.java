import java.util.Scanner;
class Stringequal{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string");
    String st1=sc.nextLine();
    System.out.println("Enter the second string");
    String st2=sc.nextLine();
    if(st1.equals(st2)){
System.out.println("Strings are equal");
    }
    else{
      System.out.println("Strings are not equal");
    }

  }
}
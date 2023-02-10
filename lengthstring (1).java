//length of the given string
import java.util.Scanner;
class lengthstring{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String st1=sc.nextLine();
    int count=0;
    for(int i=0;i<st1.length();i++)
    {
      count++;
    }
     System.out.println("The length of string is:"+count);
  }
}

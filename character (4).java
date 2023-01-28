import java.util.Scanner;
class Alpha
  {
    char cha(char ch)
    {
      return ch;
    }
  }
class character
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char ch,z;
    System.out.println("Enter the character");
    ch=sc.next().charAt(0);
    Alpha a1=new Alpha();
   z= a1.cha(ch);
   System.out.println("The given character is: "+z);  
  }
}
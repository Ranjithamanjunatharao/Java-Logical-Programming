import java.util.Scanner;
class letter
  {
    void let(char ch)
    {
      System.out.println("The given character is: "+ch);
    }
  }
class Character
  {
    public static void main(String args[])
    {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character: ");
ch=sc.next().charAt(0);
      letter l1=new letter();
      l1.let(ch);
    }
  }
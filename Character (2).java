import java.util.Scanner;
class alphabet
  {
  void ch()
    {
      char c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Character: ");
      c=sc.next().charAt(0);
       System.out.println("The given character is: "+c);
    }
  }
class Character
  {
    public static void main(String args[])
    {
      alphabet c1= new alphabet();
      c1.ch();
    }
  }
import java.util.Scanner;
class alphabet
  {
  char ch()
    {
      char c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Character: ");
      c=sc.next().charAt(0);
      return c;
       
    }
  }
class character
  {
    public static void main(String args[])
    {
      char z;
      alphabet c1= new alphabet();
      z=c1.ch();
      System.out.println("The given character is: "+z);
    }
  }
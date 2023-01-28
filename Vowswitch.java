import java.util.Scanner;
class Vowswitch
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Character");
        ch=sc.next().charAt(0);
      switch(ch)
        {
          case 'a' : case 'A':
            case 'e' : case 'E':
            case 'i' : case 'I':
            case 'o' : case 'O':
            case 'u' : case 'U':
            System.out.println("It is vowel");
             break;
          default: 
           System.out.println("It is Consonant");
        }
    }
  }
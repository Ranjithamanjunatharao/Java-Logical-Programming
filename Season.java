import java.util.Scanner;
class Season
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Month");
        n=sc.nextInt();
      switch(n)
        {
          case 3: 
             case 4:
             case 5:
             case 6:
            System.out.println("Summer Season");
            break;
            case 7: 
             case 8:
             case 9:
             case 10:
            System.out.println("Rainy Season");
            break;
             case 11: 
             case 12:
             case 13:
            System.out.println("Winter Season");
            break;
          default:
             System.out.println("Wrong choice");
        }
    }
  }
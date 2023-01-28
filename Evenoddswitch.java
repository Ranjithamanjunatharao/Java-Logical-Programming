
  import java.util.Scanner;
class Evenoddswitch
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
        n=sc.nextInt();
  
      switch(n%2)
        {
          
          case 0: 
            System.out.println("Even number");
            break;
        
            case 1:
            System.out.println("Odd number");
            break;
        }
    }
  }
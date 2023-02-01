import java.util.Scanner;
class dowhilecalculator
  {
    public static void main(String args[])
    {
      int a=0,b=0,c,ch;
      Scanner sc=new Scanner(System.in);
      do
        {
      System.out.println("CALCULATOR");
       System.out.println("-----------");
      System.out.println("[1].ADDITION");
      System.out.println("[2].SUBSTRACTION");
       System.out.println("[3].MULTIPLICATION");
      System.out.println("[4].DIVISION");
      System.out.println("[5].REMAINDER");
         System.out.println("[6].EXIT"); 
      System.out.println("Enter your choice");
      ch=sc.nextInt();
      if(ch<6)
      {
      System.out.println("Enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
      }
      switch(ch)
        {
          case 1: 
            c=a+b;
            System.out.println("The Addition value is :"+c);
            break;
            case 2: 
            c=a-b;
            System.out.println("The Substraction value is :"+c);
            break;
            case 3: 
            c=a*b;
            System.out.println("The Multiplication value is :"+c);
            break;
            case 4: 
            c=a/b;
            System.out.println("The Division value is :"+c);
            break;
            case 5: 
            c=a%b;
            System.out.println("The Remainder value is :"+c);
            break;
          case 6:
            System.exit(0);
          default:
            System.out.println("Wrong choice");
        }
        }while(true);
    }
  }
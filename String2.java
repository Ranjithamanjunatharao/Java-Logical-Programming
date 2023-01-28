import java.util.Scanner;
class stri
  {
    void st()
    {
      String str;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      str=sc.next();
      System.out.println("The given string is: "+str);
    }
  }
class String2
  {
    public static void main(String args[])
    {
      stri s1=new stri();
      s1.st();
    }
  }
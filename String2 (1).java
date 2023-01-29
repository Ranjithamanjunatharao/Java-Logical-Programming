import java.util.Scanner;
class stri
  {
    String st()
    {
      String str;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      str=sc.next();
      return str;
    }
  }
class String2
  {
    public static void main(String args[])
    {
      String z;
      stri s1=new stri();
     z= s1.st();
      System.out.println("The given string is: "+z);
    }
  }
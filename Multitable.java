//Multiplication of tables of given number
import java.util.Scanner;
class Multitable
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    int i=1;
    System.out.println("Enter the number for a table: ");
    n=sc.nextInt();
    while(i<=10)
    {
      System.out.println(n+ "*" +i+ "=" +(n*i));
      i++;
    }
 }
}

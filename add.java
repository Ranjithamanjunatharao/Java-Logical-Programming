import java.util.Scanner;
 
class Addition 
{
  int a, b, c;
  Scanner sc = new Scanner(System.in);
 
  int addi() {
    System.out.println("Enter a,b values:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = a + b;
    return c;
  }
}
 
class add {
  public static void main(String args[]) {
    int z;
 
    Addition a1 = new Addition();
    z = a1.addi();
    System.out.println("The Adddition value is:" + z);
  }
  }
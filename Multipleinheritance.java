import java.util.*; 
class base { 
  int n; 
  Scanner sc=new Scanner(System.in);
  void accept()
  {
    System.out.println("Enter n value:");
    n=sc.nextInt(); 
  } 
} 
interface interface1
  {
    public void fact();
  } 
class derive extends base implements interface1 
{
  public void fact() 
  {
    int f=1,i;
    for(i=1;i<=n;i++)
      f=f*i; 
    System.out.println("The Factorial is:"+f); 
  }
} 
class Multipleinheritance 
{
  public static void main(String args[])
  {
    derive d=new derive();
    d.accept(); 
    d.fact();
  } 
}
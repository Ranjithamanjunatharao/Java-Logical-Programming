import java.util.Scanner;
class palin
  {
    void pali(int n)
    {
    int sum=0;
    int rem;   
    int temp;
    temp=n;
      for( ;n>0; )
        {
          rem=n%10;
        sum=(sum*10)+rem;
        n=n/10;
        }
      if(temp==sum)
      System.out.println("It is a Palindrome");
      else
      System.out.println("It is not a Palindrome");
}
  }
class forpalindrome
  {
    public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    
    System.out.println("Enter the value of n:");
    n=sc.nextInt();
palin p1=new palin();
    p1.pali(n);

  }
  }
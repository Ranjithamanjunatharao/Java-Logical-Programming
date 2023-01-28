import java.util.*;
class vote
  {
    public static void main(String args[])
    {
    int age;
    String name;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter your age:");
age=sc.nextInt();
 System.out.println("enter your name:");
name=sc.next();
if(age>=18)
{
  System.out.println(name + "is eligible to vote");
}
else
{
  System.out.println(name + "is not  eligible to vote");
}
  }
  }
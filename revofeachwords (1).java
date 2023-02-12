import java.util.Scanner;
class revofeachwords
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your string: ");
    String s=sc.nextLine();
    String s1[]=s.split(" ");
    for(int i=0;i<s1.length;i++)
      {
        String c=s1[i];
        String s2="";
        for(int j=c.length()-1;j>=0;j--)
          {
            s2=s2+c.charAt(j);
          }
        System.out.print(" "+s2);
      }
      
    }
  }

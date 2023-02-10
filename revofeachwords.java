import java.util.Scanner;
class revofeachwords
{
  public static void main(String args[])
  {
    String str="Hai Hello welcome to bitlabs";
    String words[]=str.split(" ");
    String s=" ";
     for(int i=str.length()-1;i>=0;i--)
    {
       s=s+str.charAt(i);
      
    }
  }
}
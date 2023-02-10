//Write a JAVAprogram to find total number of alphabets, digits or special character in a string.

import java.util.Scanner;
class Alphadigitspecial
{
  public static void main(String args[])
  {
    int i=0,j=0,k=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string ");
    String st1=sc.nextLine();
    for(int p=0;p<st1.length();p++){
    if(st1.charAt(p)>='a'&&st1.charAt(p)<='z'|| st1.charAt(p)>='A' && st1.charAt(p)<='Z')
    {      
      i++;
    }
   else if(st1.charAt(p)>='0'&&st1.charAt(p)<='9'){
     j++;
   }
   else
   {
     k++;
   }
}
    System.out.println("The total number of alphabets are:"+i);
     System.out.println("The total number of digits are:"+j);
     System.out.println("The total number of special characters  are:"+k);
}
}
  
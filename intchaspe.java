import java.util.*;
 class intchaspe
{
	public static void main(String[] args) {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Digit/Character/Special character :");
    ch=sc.next().charAt(0);
    if(ch>='0' && ch<='9' ){
           System.out.println("It is  digit");
       }
     else if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z'){
         System.out.println("It is  character");
     }
     else{
         System.out.println("It is  special character");
     }
    
	}	
}
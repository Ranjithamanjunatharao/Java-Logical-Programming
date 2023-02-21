/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a                             
   a b c b a
     a b a
       a
*/


public class DiamondPattern {

//Add main method here
  public static void main(String args[]){

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
 int i,j,k,m=3;
    char ch;
//use for loop and if condition to print a,b,c 
    for(i=1;i<=m;i++){
      for(j=1;j<=m-i;j++){
        System.out.print("  ");
      }
       k=1;
      if (k<=i){
        ch=97;
        while(k<=2*i-1){
          if(k<i){
            System.out.print(ch+" ");
            ch++;
          }
          else{
            System.out.print(ch+" ");
            ch--;
          }
          k++;
        }
      }
      System.out.println();
    }
    for(i=m-1;i>0;i--){
      for(j=1;j<=m-i;j++){
        System.out.print("  ");
      }
       k=1;
      if (k<=i){
        ch=97;
        while(k<=2*i-1){
          if(k<i){
            System.out.print(ch+" ");
            ch++;
          }
          else{
            System.out.print(ch+" ");
            ch--;
          }
          k++;
        }
      }
      System.out.println();
    }
      
    
    }
     
}

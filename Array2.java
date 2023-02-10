import java.util.Scanner;
class Array2{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    int i,j;
    System.out.println("Enter the elements in an Array:");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Elements in an Array are:");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        System.out.print(" "+a[i][j]);
  }
  System.out.println();    
}
  }
}
import java.util.Scanner;
class MatrixAddition
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row size:");
    int r1=sc.nextInt();
     System.out.println("Enter the column size:");
    int c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    int b[][]=new int[r1][c1];
    int c[][]=new int[r1][c1];
    System.out.println("Enter the elements into 1st matrix:");
    for(int i=0;i<r1;i++)
    {
      for(int j=0;j<c1;j++){
        a[i][j]=sc.nextInt();
      }
    }
 System.out.println("Enter the elements into 2nd matrix:");
    for(int i=0;i<r1;i++)
    {
      for(int j=0;j<c1;j++){
        b[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r1;i++)
    {
      for(int j=0;j<c1;j++){
        c[i][j]=a[i][j]+b[i][j];
      }
    }
 System.out.println("The Addition of the matrix is:");
    for(int i=0;i<r1;i++)
    {
      for(int j=0;j<c1;j++){
    System.out.println(c[i][j]);
      }
    }
    System.out.println();
  }
}
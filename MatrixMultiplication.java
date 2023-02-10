import java.util.Scanner;
class MatrixMultiplication
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i,j,r1,c1,r2,c2,k,sum=0;
    System.out.println("Enter the row size for 1st matrix");
    r1=sc.nextInt();
    System.out.println("Enter the column size for 1st matrix");
    c1=sc.nextInt();
    int a[][]=new int[r1][c1];
    System.out.println("Enter the elements into 1st matrix:");
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c1;j++){
      a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter the row size for 2nd matrix");
    r2=sc.nextInt();
    System.out.println("Enter the column size for 2nd matrix");
    c2=sc.nextInt();
if(c1!=r2)
   System.out.println("Matrix cannot be multiplied each other");

    else{
       int b[][]=new int[r2][c2];
      int c[][]=new int[r1][c2];
    System.out.println("Enter the elements into 2nd matrix:");
    for(i=0;i<r2;i++)
      for(j=0;j<c2;j++)
        b[i][j]=sc.nextInt();
  for(i=0;i<r1;i++)
    {
  for(j=0;j<c2;j++)
  {
    for(k=0;k<r2;k++)
    {
      sum=sum+a[i][k]*b[k][j];
    }
    c[i][j]=sum;
    sum=0;
  }
  }
System.out.println("The Multiplication matrix is:");
   for(i=0;i<r1;i++){
  for(j=0;j<c2;j++){
     System.out.println(c[i][j]);
    } 
   }
    }
 System.out.println(); 
  }
}

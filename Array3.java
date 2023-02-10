import java.util.Scanner;
class Array3{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      
    int r1,c1,i,j;
    System.out.println("Enter the row size:");
    r1=sc.nextInt();
    System.out.println("Enter the column size:");
    c1=sc.nextInt();
     System.out.println("Enter the elements in an array:");
    int a[][]=new int[r1][c1];
    for(i=0;i<r1;i++){
      for(j=0;j<c1;j++){
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Elements in an Array are:");
    for(i=0;i<r1;i++){
      for(j=0;j<c1;j++){
        System.out.print(" "+a[i][j]);
  }
  System.out.println();    
}
  }
}
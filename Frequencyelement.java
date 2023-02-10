//JAVA program to count frequency of each element in an array.
import java.util.Scanner;
class Frequencyelement{
  public static void main(String args[]){
int a[]={1,2,2,3,4,5,5,6,7,8,8,8};
    for(int i=0;i<a.length;i++){
      int x=a[i];
      int count=0;
      if(x==-1)continue;
      for(int j=0;j<a.length;j++){
        if(a[j]==x){
          count++;
          a[j]=-1;
        }
      }
      System.out.println("Frequency of "+x+" is "+count);
    }
    
  }
}
/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/

/*public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {

    }
}*/

public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
     int a[]={3,6,7,9};
      int a1[]={2,4,5,11};
      int a2[]=new int[4];
      int c=0,count=0;
      try{
      for(int i=0;i<a.length;i++){
        count=0;
        int k=a[i];
        for(int j=1;j<=k;j++){
          if(k%j==0){
            count++;
          }
        }
        if(count==2){
          a2[c]=a[i];
          c++;
        }
      }
      for(int i=0;i<a1.length;i++){
        count=0;
        int m=a1[i];
        for(int j=1;j<=m;j++){
          if(m%j==0){
            count++;
          }
        }
        if(count==2){
          a2[c]=a1[i];
          c++;
        }
      }
      }
      catch(Exception e){
        System.out.println(e);
      }
      finally{
        System.out.println("the prime elements in 3rd array");
        for(int i=0;i<a2.length;i++){
          System.out.print(a2[i]+" ");
        }
      }
    }
}
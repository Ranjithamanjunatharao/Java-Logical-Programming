/*
3) Union and Intersection of two sorted arrays
 
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}


*/
import java.util.*;

class Subarray{
    Scanner sc=new Scanner(System.in);
    void getArray(int a[],int n){
        for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		}
    }
    void sumOFsubarray(int a[],int a1[],int n,int m){
    int i=0,j=0;
    while(i<n && j<m){
        if(a[i]<a1[j]){
            System.out.print(a[i]+" ");
            i++;
        }
        else if(a[i]>a1[j]){
            System.out.print(a1[j]+" ");
            j++;//4
        }
        else{
            System.out.print(a[i]+" ");
            i++;
            j++;
        }
    }
     while (i < n)
            System.out.print(a[i++] + " ");
        while (j < m)
            System.out.print(a1[j++] + " ");
    }
    void IntersectionOFsubarray(int a[],int a1[],int n,int m){
    int i=0,j=0;
    while(i<n && j<m){
        if(a[i]<a1[j]){
            i++;
        }
        else if(a[i]>a1[j]){
            j++;
        }
        else{
            System.out.print(a[i]+" ");
            i++;
            j++;
        }
    }
    }
}

public class Unionandintersection
{
	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size :");
		n=sc.nextInt();
		System.out.println("enter your array size :");
		m=sc.nextInt();
		int a[]=new int[n];
		int a1[]=new int[m];
		
		
		
	    Subarray s1=new Subarray();
	    System.out.println("enter your elements in 1st array :");
	    s1.getArray(a,n);
	     System.out.println("enter your elements in 2nd array :");
	    s1.getArray(a1,m);
	    System.out.println("elements in array after union :");
		s1.sumOFsubarray(a,a1,n,m);
		System.out.println();
		System.out.println("elements in array after intersection :");
		s1.IntersectionOFsubarray(a,a1,n,m);
		
		
	}
}
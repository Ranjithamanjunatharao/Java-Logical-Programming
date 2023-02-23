/*
Write a program to create a Stack of Integer type and push five elements to it. 
Then, use a while loop to pop all the elements from the Stack.


*/
import java.util.*;
public class Stackint
{
	public static void main(String[] args) {
		Stack <Integer> st=new Stack<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);

		System.out.println(st);
    int n=st.size();
       int i=0;
       while(i<n){
           System.out.println(st.pop());
           i++;
       }
  }
}

package Stack;
import java.util.*;
public class ArrayListStack {
 static ArrayList<Integer>list =new ArrayList<>();
 
 public static boolean isEmpty() {
	 return list.size()==0;
 }
 public static void push(int data) {
	 list.add(data);
	 System.out.println(data+"added");
 }
 public static int pop() {
	 if(isEmpty()) {
		 return -1;
	 }
	 return list.remove(list.size()-1);
 }
 public static int peek() {
	 if(isEmpty()) {
		 return -1;
	 }
	 return list.get(list.size()-1
			 );
 }
 public static void main(String[] args) {
     push(10);
     push(20);
     push(30);
     while(!isEmpty()) {
    	 System.out.println(peek());
    	 pop();
     }
   
}
}
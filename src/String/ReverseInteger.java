package String;

public class ReverseInteger {
 public static int reverseInteger(int x) {
	  int rev=0;
	  while(x!=0) {
		   int digit=x%10;
		  x= x/10;
		   rev= rev*10+digit;
	  }
	  return rev;
 }
 public static void main(String[] args) {
	 int x=123;
	 
	 System.out.println(reverseInteger(x));
 }
}

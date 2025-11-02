package Arrays_problem;

import java.util.Arrays;

public class PlusOne_69 {
	public static int[] plusOne(int[] digit) {
		int n= digit.length;
		for(int i=n-1;i>=0;i--) {
			if(digit[i]<9) {
				digit[i]++;
				return digit;
			}
			digit[i]=0;
		}
		int [] result=new int[n+1];
		result[0]=1;
		return result;
	
	}
 public static void main (String [] args) {
	 int [] digit = {1,2,9};
	 System.out.println(Arrays.toString(plusOne(digit)));
 }
}

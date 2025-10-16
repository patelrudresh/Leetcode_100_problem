package Arrays_problem;

import java.util.Arrays;
import java.util.HashSet;

public class Contain_Duplicate {
//	public static boolean findDuplicate(int arr[]) {
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]==arr[i+1]) {
//				return true;
//			}
//			
//		}return false;
//	}
//using-hashset
	 public static boolean findDuplicate(int arr[]) {
		 HashSet< Integer>set=new HashSet();
		 for(int nums:arr) {
			if(set.contains(nums)) {
				return true;
			} 
			set.add(nums);
		 }
		 return false;
	 }
	public static void main(String[] args) {
		int arr[]= {1,5,2,4,1};
		boolean result=findDuplicate(arr);
		if(result) {
			System.out.println("yes containe");
		}else
			System.out.println("Not yes containe");
	}
}

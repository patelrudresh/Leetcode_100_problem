package Arrays_problem;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
 //with thetwo pointer appraoch
public static int duplicateNumber(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		return i+1;
	}
	
	// solution with streanms
	/*public static int duplicateNumber(int arr[]) {
		int []unique=Arrays.stream(arr).distinct().toArray();
		for(int i=0;i<unique.length;i++) {
			arr[i]=unique[i];
		}
		return unique.length;
	}*/
	
	//using temp array
	
//	public int duplicateNumber(int arr[]) {
//		int []temp=new int[arr.length];
//		int j=0;
//		temp[j++]=arr[0];
//		
//		for(int i=1; i<arr.length;i++) {
//			if(arr[i]!=arr[i-1]) {
//				temp[j++]=arr[i];
//			}
//		}
//		for (int i=0; i<temp.length;i++) {
//			arr[i]=temp[i];
//			
//		}
//		return j;
//	}
	public static void main(String[] args) {
		RemoveDuplicate rd=new RemoveDuplicate();
//		Scanner sc=new Scanner(System.in);
		int arr[]= {1,1,2,2,3,4,4};
//    int size=sc.nextInt();
//    int arr[] =new int[size];
//    for(int num=0;num<size;num++) {
//    arr[num]=sc.nextInt();
//    }
		int newarr=rd.duplicateNumber(arr);
		System.out.println("dupilcate number is "+newarr);
		
		for(int i=0; i<newarr;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

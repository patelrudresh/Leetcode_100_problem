package Arrays_problem;

public class Single_Find {
  public static int singlefind(int []arr) {
	  int n=arr.length-1;
	    for(int i=0;i<n;i++) {
		  if(arr[i]!=arr[i+1]) {
		
		return arr[i];
		  }
	  }
	  return arr[n-1];
	  
  }
  public static void main(String[] args) {
	  int []arr= {2,2,3,3};
	  int result=singlefind(arr);
	  System.out.println(result);
  }
}

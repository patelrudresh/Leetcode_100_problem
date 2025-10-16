package Arrays_problem;

import java.util.Arrays;

public class moveToZero {
	
	    public void moveZeroes(int[] nums) {
	         int insertzero=0;
	        int n=nums.length;
	        for(int i=0;i<n;i++){
	            if(nums[i]!=0){
	            nums[insertzero]=nums[i];
	                insertzero++;
	            }
	        }
	        
	        while(insertzero<n){
	            nums[insertzero]=0;
	            insertzero++;
	            
	        }
	    }
	    public static void main(String[] args) {
	        moveToZero obj = new moveToZero();
	        int[] nums = {0, 1, 0, 3, 12};
	        
	        obj.moveZeroes(nums);
	        
	        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
	    }
	}


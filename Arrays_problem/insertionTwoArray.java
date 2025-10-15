package Arrays_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertionTwoArray {
	
	    public int[] intersect(int[] nums1, int[] nums2) {
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);

	        List<Integer> resultList = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < nums1.length && j < nums2.length) {
	            if (nums1[i] == nums2[j]) {
	                resultList.add(nums1[i]);
	                i++;
	                j++;
	            } else if (nums1[i] < nums2[j]) {
	                i++;
	            } else {
	                j++;
	            }
	        }

	
	        int[] result = new int[resultList.size()];
	        for (int k = 0; k < resultList.size(); k++) {
	            result[k] = resultList.get(k);
	        }
	        return result;
	    }
	    
	    public static void main (String[] args) {
	    	int [] nums1= {1,2,5,4,6,6};
	    	int []nums2= {1,4,5,2,8,9};
	    	  insertionTwoArray obj = new insertionTwoArray();
	          int[] intersection = obj.intersect(nums1, nums2);
	          
	          System.out.println("Intersection elements: " + Arrays.toString(intersection));
	    	
	    }
	}



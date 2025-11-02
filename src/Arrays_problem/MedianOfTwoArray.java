package Arrays_problem;

public class MedianOfTwoArray {
	
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	         int i=0;
	         int j=0;
	         int k=0;
	         int m[]=new int[nums1.length+nums2.length];
	          
	         while(i<nums1.length && j<nums2.length){
	                if(nums1[i]<nums2[j]){
	                    m[k]=nums1[i];
	                    i++;
	                    k++;
	                }else{
	                    m[k]=nums2[j];
	                    k++;
	                    j++;
	                }
	         }
	                while(i<nums1.length ){
	                                        m[k]=nums1[i];
	                    i++;
	                    k++;
	                }
	                 while(j<nums2.length ){
	                                        m[k]=nums2[j];
	                    j++;
	                    k++;
	                }
	            if(m.length%2==0){
	                int mid=m.length/2;
	                return (float)(m[mid]+m[mid-1])/2;
	            }else{
	             int  mid=m.length/2;
	             return m[mid];
	            }

	    }
	    
	     public static void main(String [] args) {
	    	 int[] nums1= {1,2,3};
	    	 int[] nums2= {5,6,7,8};
	    	
	    	 
	     }
	}


package Challenge14;

import java.util.Arrays;

public class MergeSortedArray {

	public MergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];    
            }
        Arrays.sort(nums1);

	}

}

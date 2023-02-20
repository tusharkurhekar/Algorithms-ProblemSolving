package Challenge14;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArraysII {

	public int[] IntersectionOfArraysII(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        //sorting makes comparisons easy

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int i=0, j=0;

        //running this loop till last elements 
        while(i<nums1.length && j<nums2.length){

            //do not care if its equal or less, just increase and check for 
            //similar ones, then add them in the list as order doesn't matter 
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        //converting array list to array 
        int[] output = new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            output[k] = arr.get(k);
        }

        return output;
	}

}

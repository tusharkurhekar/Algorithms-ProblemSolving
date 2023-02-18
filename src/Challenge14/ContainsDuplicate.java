/**
 * 
 */
package Challenge14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author tusharkurhekar
 *
 */
public class ContainsDuplicate {

	/**
	 * Given an integer array nums, return true if any value appears at least twice in the array, 
	 * and return false if every element is distinct.
		Example 1:
		Input: nums = [1,2,3,1]
		Output: true
	 */
	
	public boolean ContainsDuplicate(int nums[]) {
		// TODO Auto-generated constructor stub
		
		//time complexity 0n and space is less comapred to hashmap 
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;


        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         return true;
        //     }
        //     map.add(nums[i]);
        // }
        // return false;
        

        
        // time complexity hashmap 0(n)

        //HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return true;
        //     }
        //     map.put(nums[i], 1);
        // }
        // return false;
        
        
        // //time complexity is of quicksort (nlogn)

        // Arrays.sort(nums);

        // for(int i=0;i<nums.length -1; i++){
        //     if(nums[i]== nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
		
	}

}

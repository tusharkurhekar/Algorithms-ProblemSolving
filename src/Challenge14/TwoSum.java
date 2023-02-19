package Challenge14;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] TwoSum(int[] nums, int target) {
        
        //two sum

        int[] result = new int[2]; //becuase we know its only two numbers whos sum is target 

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);  //giving key and getting the value which is position in the array 
                break;
            }
            map.put(nums[i], i);
        }

        return result;
	}

}

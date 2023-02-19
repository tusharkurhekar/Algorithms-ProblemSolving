package Challenge14;

public class MaximumSubarray {

	public int MaximumSubarray(int[] nums) {
        
        // time complexity o(n) - one for loop 
        // space o(n)
        
        int sum=nums[0];
        int max=sum;

        for(int i=1;i<nums.length;i++){
        
            sum = Math.max(sum+nums[i], nums[i]);
            max = Math.max(max, sum);

        }
        return max;

	}

}

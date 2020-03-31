public class MaxContiguousSubarray {
    public int maxSubArray(int[] nums) {
        if(nums==null) return -1;
        if(nums.length==1){
            return nums[0];
        }
        int maxSum=nums[0];
        int tempSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(tempSum<0){
                tempSum=0;
            }
            tempSum+=nums[i];
            maxSum=Math.max(tempSum,maxSum);
        }
        return maxSum;
    }
}
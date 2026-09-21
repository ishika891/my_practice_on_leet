class Solution {
    public int missingNumber(int[] nums) {
        long sum=(nums.length*(nums.length+1))/2;
       long sum1=0;
       for(int i=0;i<nums.length;i++){
        sum1+=nums[i];
       }
        return (int)(sum-sum1);
       }
    
}
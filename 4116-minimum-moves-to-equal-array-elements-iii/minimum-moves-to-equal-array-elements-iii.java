class Solution {
    public int minMoves(int[] nums) {
     int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){max=nums[i];}
        }
        for(int j=0;j<nums.length;j++){
            sum=sum+max-nums[j];
        }
        return sum;}}
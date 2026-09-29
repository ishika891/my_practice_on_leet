class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        int max1=0;
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(-1*nums[i]);
            max1=Math.max(sum,max1);
            if(sum<0){
                sum=0;
            }
        }
        return Math.max(max1,max);
    }
}
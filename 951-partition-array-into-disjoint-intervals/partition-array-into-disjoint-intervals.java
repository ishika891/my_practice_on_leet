class Solution {
    public static int disjoint(int nums[]){
        //find max from the left
        int left[]=new int [nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++ ){
            left[i]=Math.max(left[i-1],nums[i]);
        }
        //find min from the right
        int right[]=new int[nums.length];
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=Math.min(right[i+1],nums[i]);
        }
        for(int i=0;i<nums.length-1;i++){
            if(left[i]<=right[i+1]){return i+1;}
        }
        return -1;
    }
    public int partitionDisjoint(int[] nums) {
        return disjoint(nums);
    }
}
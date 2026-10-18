class Solution {
    public int minDeletions(int[] nums) {
        int count=0;
        int i=0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length&&nums[i]==nums[j]){
                count++;
                j++;
            }
            i=j;
           
        }
        return count;
    }
}
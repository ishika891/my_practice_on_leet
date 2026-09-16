class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indx[]=new int[2];
       for(int i=0;i<nums.length;i++){
        int a=target-nums[i];
        for(int j=i+1;j<nums.length;j++){
            if(a==nums[j]){indx[0]=i;
            indx[1]=j;
            return indx;}
        }
       }
       return indx;
    }
}
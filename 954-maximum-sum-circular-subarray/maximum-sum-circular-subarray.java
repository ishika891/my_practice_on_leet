class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){sum+=nums[i];}
        int ksum=0;
        int kmax=nums[0];
        for(int i=0;i<nums.length;i++){ksum+=nums[i];
        kmax=Math.max(kmax,ksum);
        if(ksum<0){ksum=0;}}
        ksum=0;
        int kmin=nums[0];
        for(int i=0;i<nums.length;i++){ksum+=nums[i];
        kmin=Math.min(kmin,ksum);
        if(ksum>0){ksum=0;}
        }
        if(kmax<0){return kmax;}
        else{return Math.max(sum-kmin,kmax);}
    }
}
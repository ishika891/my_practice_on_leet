class Solution {
    public int majorityElement(int[] nums) {
        int vote=1;
        int elected=nums[0];
        for(int i=1;i<nums.length;i++){
            if(elected==nums[i]){vote++;}
            else{vote--;}
            if(vote==0){elected=nums[i];
            vote=1;}
        }
        return elected;
    }}
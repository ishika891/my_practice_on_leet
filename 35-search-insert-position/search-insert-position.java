class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=0;
       int j=nums.length-1;
       if(nums[0]>=target){return 0;}
       if(nums[nums.length-1]<target){return nums.length;}
       while(i<=j){

        int mid=i+(j-i)/2;
        if(target==nums[mid]){return mid;}
        else if(nums[mid]<target){i=mid+1;}
        else{j=mid-1;}
       }
       return i;
           }
}
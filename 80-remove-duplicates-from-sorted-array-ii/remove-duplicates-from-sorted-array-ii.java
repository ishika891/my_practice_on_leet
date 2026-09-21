class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int i=0;
       while(i<nums.length){
        int count=1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){count++;}
            else {break;}
        }
        if(count>=2){nums[index++]=nums[i];
        nums[index++]=nums[i];}
        else{nums[index++]=nums[i];}
        i+=count-1;
        i++;
       }
        return index;
    }
}
class Solution {
    public static int[] reverse(int nums[],int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
        return nums;
    }
    public int[] rotate(int[] nums, int k) {
   /* int temp[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        temp[(i+k)%nums.length]=nums[i];
    }
    for(int i=0;i<nums.length;i++){
        nums[i]=temp[i];
    }
    return nums;*/
    /*int temp[]=new int[nums.length];
    k%=nums.length;
    for(int i=0;i<nums.length;i++){
        temp[i]=nums[((nums.length-k+i)%nums.length)];
    }   
    for(int i=0;i<nums.length;i++){
        nums[i]=temp[i];

    } return nums;*/
    int n=nums.length-1;
    k=k%(n+1);
    reverse(nums,0,n);
    reverse(nums,0,k-1);
    reverse(nums,k,n);
    return nums;
    }
}
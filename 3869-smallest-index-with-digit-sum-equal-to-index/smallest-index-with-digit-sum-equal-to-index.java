class Solution {
    public int smallestIndex(int[] nums) {
        int x=100;
        for(int i=0;i<nums.length;i++){
           int rem=nums[i];
           int sum=0;
           for(;rem!=0;rem=rem/10){
            sum=sum+rem%10;
           }
           if(sum==i&&i<x){x=i;}
        }

       if(x==100){return -1;}
       else{ return x;}
    }
}
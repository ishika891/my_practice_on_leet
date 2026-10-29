class Solution {
    public int countEven(int num) {
       int t=num;
       int sum=0;
       while(t>0){
        sum+=t%10;
        t/=10;
       }
       return ((num-(sum%2))/2);
    }}

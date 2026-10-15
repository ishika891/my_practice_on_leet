class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
       for(int i=0;i<nums.size();i++){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int j=i;j<nums.size();j++){
            if(map.containsKey(nums.get(j))){map.put(nums.get(j),map.get(nums.get(j))+1);}
            else{map.put(nums.get(j),1);
            count++;}
            sum+=count*count;
        }
       } 
       return sum;
    }
}
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{map.put(nums[i],1);}
        }
        int e=0;
        while(e<nums.length){
        for(int x:map.keySet()){
            if(map.get(x)>0){
                ans[e++]=x;
                map.put(x,map.get(x)-1);
            }
        }
        } 
        return ans;
    }
}
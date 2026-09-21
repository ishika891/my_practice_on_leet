class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }}
            int index=0;
            for(Integer key:map.keySet()){
                if(map.get(key)>=2){
                    nums[index++]=key;
                    nums[index++]=key;
                }
                else{nums[index++]=key;}

            }
          
        
        return index;
    }
}
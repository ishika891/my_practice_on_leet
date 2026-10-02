class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        int max=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{map.put(nums[i],1);}
        }
       for(int x:map.keySet()){
        if(map.get(x)>max){
            lst.add(x);
        }
       }
      return lst;
        }
    }

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(map.containsKey(grid[i][j])){
                    map.put(grid[i][j],map.get(grid[i][j])+1);
                }
                else{map.put(grid[i][j],1);}
            }
        }
        int nums[]=new int[2];
        int i=1;
        int flag=0;
        for(Integer x:map.keySet()){
            if(map.get(x)>1){nums[0]=x;}
            if(map.containsKey(i)){
                i++;
            }
            else{
                flag=1;
                nums[1]=i;}
        }
       if(flag==0){nums[1]=grid.length*grid.length;}
        return nums;
    }
}
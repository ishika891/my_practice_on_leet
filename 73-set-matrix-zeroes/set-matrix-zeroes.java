class Solution {
    public static int[][] set(int [][]nums){
      int ans[][]=new int[nums.length*nums[0].length][2];
      int indx=0;
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            if(nums[i][j]==0){
            ans[indx][0]=i;
            ans[indx++][1]=j;}
        }
      }
       while(indx-->0){
            for(int i=0;i<nums.length;i++){nums[i][ans[indx][1]]=0;}
            for(int j=0;j<nums[0].length;j++){nums[ans[indx][0]][j]=0;}
       }
      return nums;
    }
    public int[][] setZeroes(int[][] matrix) {
      return set(matrix);
      
    }
}
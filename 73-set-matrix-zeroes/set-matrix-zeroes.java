class Solution {
    public static int[][] set(int [][]nums){
      int ans[][]=new int[nums.length][nums[0].length];
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            ans[i][j]=nums[i][j];
        }
      }
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            if(ans[i][j]==0){
                for(int k=0;k<nums.length;k++){
                    nums[k][j]=0;
                }
                 for(int k=0;k<nums[i].length;k++){
                    nums[i][k]=0;
                }
            }
        }
      } 
      return nums;
    }
    public int[][] setZeroes(int[][] matrix) {
      return set(matrix);
      
    }
}
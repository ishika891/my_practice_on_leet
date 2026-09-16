class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int n=0;n<matrix.length;n++){
            int i=0;
            int j=matrix[n].length-1;
            while(i<j){
                int temp=matrix[n][j];
                matrix[n][j]=matrix[n][i];
                matrix[n][i]=temp;
                i++;
                j--;
            }
              
        }
     
    } 
}
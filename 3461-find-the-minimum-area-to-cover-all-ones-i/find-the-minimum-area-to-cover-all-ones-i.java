class Solution {
    public int minimumArea(int[][] grid) {
        int x1=Integer.MAX_VALUE;
        int x2=Integer.MIN_VALUE;
        int y1=Integer.MAX_VALUE;
        int y2=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    if(x1>i){x1=i;}
                    if(x2<i){x2=i;}
                    if(y1>j){y1=j;}
                    if(y2<j){y2=j;}
                }
            }
        }
        return (x2-x1+1)*(y2-y1+1);
    }
}
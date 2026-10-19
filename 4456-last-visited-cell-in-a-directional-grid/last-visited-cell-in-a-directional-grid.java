class Solution {
    public int[] lastVisitedCell(char[][] grid) {
       int x=0;
       int y=0;
       int vis[][]=new int[grid.length][grid[0].length];
      while(true){
            char ch=grid[x][y];
            vis[x][y]=1;
            int i=x;
            int j=y;
            if(ch=='R'){y++;}
            else if(ch=='L'){y--;}
            else if(ch=='U'){x--;}
            else if(ch=='D'){x++;}
            if(x<0||x>=grid.length||y<0||y>=grid[x].length||vis[x][y]==1){
                int ind[]={i,j};
                return ind;}
       } 
      
    }
}
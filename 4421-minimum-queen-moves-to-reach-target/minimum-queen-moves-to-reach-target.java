class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int count=0;
        int dif1=Math.abs(source[0]-target[0]);
        int dif2=Math.abs(source[1]-target[1]);
        if(source[0]==target[0]&&source[1]==target[1]){return 0;}
        if(dif1==0||dif2==0){return 1;}
        if(dif1!=dif2){return 2;}
        else{return 1;}
    }
}
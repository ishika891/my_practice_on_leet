class Solution {
    public int calculateScore(int a, int b) {
        int x=0;
        int y=0;
        while(a!=0){x+=(a&1);
                   a=(a>>1);}
        while(b!=0){y+=(b&1);
                   b=(b>>1);}
        if(x>=y){return x*y;}
        return y/x;
       
        
    }
}
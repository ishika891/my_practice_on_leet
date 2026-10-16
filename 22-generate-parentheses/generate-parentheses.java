class Solution {
    public static void para(int n,int o,int c,String ans,List<String> lst){
        if(o==n&&c==n){
            lst.add(ans);
            return ;}
        if(o>n||c>o){return ;}
        para(n,o+1,c,ans+"(",lst);
        para(n,o,c+1,ans+")",lst);

    }
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
         para(n,0,0,"",lst);
         return lst;
    }
}
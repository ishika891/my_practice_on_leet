class Solution {
    public int reverseDegree(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=(int)(123-s.charAt(i))*(i+1);
        }
        return count;
    }
}
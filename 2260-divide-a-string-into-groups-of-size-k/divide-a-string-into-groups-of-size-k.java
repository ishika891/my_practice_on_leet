class Solution {
    public String[] divideString(String s, int k, char fill) {
        int l=s.length();
        StringBuilder sb= new StringBuilder(s);
        while(l%k!=0){sb.append(fill);
        l++;}
        String nums[]=new String[l/k];
        String st=sb.toString();
        int indx=0;
        for(int i=0;i<=st.length()-k;i=i+k){
            nums[indx++]=st.substring(i,i+k);
        }
        return nums;
    }}
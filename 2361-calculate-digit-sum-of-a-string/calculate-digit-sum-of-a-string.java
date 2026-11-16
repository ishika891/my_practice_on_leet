class Solution {
    public String digitSum(String s, int k) {
    
        while(s.length()>k){
            StringBuilder sb = new StringBuilder();
            int sum=0;
            int in=0;
            for(int i=0;i<s.length();i++){
                sum+=Integer.parseInt(s.charAt(i)+"");
                in++;
                if(in%k==0){sb.append(sum);
                sum=0;
                in=0;}
                if(in!=0&&i==s.length()-1){
                    sb.append(sum);
                }
            }
          
            s=sb.toString();

    }
    return s;
}}
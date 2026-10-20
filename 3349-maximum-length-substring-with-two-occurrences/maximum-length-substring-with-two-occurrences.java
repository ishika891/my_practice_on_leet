class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            int count=0;
            for(int j=i;j<s.length();j++){
                   char ch= s.charAt(j);
                if(map.containsKey(ch)){
                    if(map.get(ch)==2){count=0;
                    break;}
                    else{
                        map.put(ch,map.get(ch)+1);
                        count++;
                    }

                }
                else{
                    map.put(ch,1);
                    count++;
                }
                max=Math.max(count,max);}
            }
        return max;
    }
}
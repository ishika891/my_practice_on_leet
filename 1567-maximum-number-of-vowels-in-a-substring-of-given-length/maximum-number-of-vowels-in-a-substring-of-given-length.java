class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        String v="aeiou";
        for(int i=0;i<k;i++){
          int a=v.indexOf(s.charAt(i));
          if(a!=-1){count++;}

        }
        max=Math.max(max,count);
        for(int i=k;i<s.length();i++){
            int a=v.indexOf(s.charAt(i));
            if(a!=-1){count++;}
            int b=v.indexOf(s.charAt(i-k));
            if(b!=-1){count--;}
            max=Math.max(max,count);
        }
        return max;
    }
}
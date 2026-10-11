class Solution {
    public int lengthOfLongestSubstring(String s) {
        //1 solution
         int max=0;
    for(int j=0;j<s.length();j++){
    HashMap<Character,Integer> map=new HashMap<>();
    int count=0;
    for(int i=j;i<s.length();i++){
      char ch=s.charAt(i);
      if(map.containsKey(ch)){
          break;
      }
      else{map.put(ch,1);
      count++;}
      max=Math.max(max,count);
  }}
  //2 solution
    /*if(s.length()<=1){return s.length();}
    int max=0;
    for(int i=0;i<s.length();i++){
       StringBuilder sb= new StringBuilder();
       for(int j=i;j<s.length();j++){
           String st=sb.toString();
          int a=st.indexOf(s.charAt(j));
           if(a!=-1){
              break;}
           else {
              sb.append(s.charAt(j));}
       }
    if(max<sb.length()){max=sb.length();}
    }*/
   
    return max;
    }
}
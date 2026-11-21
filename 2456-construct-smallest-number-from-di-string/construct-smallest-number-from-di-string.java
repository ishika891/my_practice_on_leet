class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb= new StringBuilder();
        Stack<Integer> st=new Stack<>();
      for(int i=0;i<=pattern.length();i++){
            st.push(i+1);
                if((pattern.length()==i)||pattern.charAt(i)=='I'){
                    while(!st.isEmpty()){
                        sb.append(st.pop());
                    }
                }
            }
      
      return sb.toString();
     
    }
     
}
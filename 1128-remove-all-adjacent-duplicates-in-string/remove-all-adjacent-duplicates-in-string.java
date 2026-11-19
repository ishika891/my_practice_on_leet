class Solution {
    public String removeDuplicates(String s) {
        if(s.isEmpty()){
            return "";
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&&st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char x:st){
            sb.append(x);
        }
        return sb.toString();
    }    
    
}
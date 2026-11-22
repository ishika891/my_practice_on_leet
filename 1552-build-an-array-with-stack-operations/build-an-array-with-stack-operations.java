class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> lst=new ArrayList<>();
        Stack<Integer> st= new Stack<>();
        int i=0;
        int indx=0;
        while(i++<=n){
            lst.add("Push");
            st.push(i);
            if(st.peek()!=target[indx]){
                lst.add("Pop");
                st.pop();
            }
            else{
                indx++;
            }
            if(indx==target.length){
                break;
            }

        }
        return lst;
    }
}
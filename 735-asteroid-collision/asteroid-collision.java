class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int a=asteroids[i];
            int flag=0;
           while(!st.isEmpty()&&st.peek()>0&&a<0){
            if(st.peek()<-a){
                st.pop();
            }else if(st.peek()==-a){
                flag=1;
                st.pop();
                break;
            }
            else{
                flag=1;
                break;
            }

           }
           if(flag==0){st.push(a);}
        }
        int ans[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}
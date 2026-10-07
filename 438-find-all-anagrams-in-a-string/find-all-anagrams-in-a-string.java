class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst=new ArrayList<>();
        char num[]=p.toCharArray();
        Arrays.sort(num);
        for(int i=0;i<=s.length()-p.length();i++){
            String st=s.substring(i,i+p.length());
            char num1[]=st.toCharArray();
            Arrays.sort(num1);
            if(Arrays.equals(num,num1)){lst.add(i);}
        }
        return lst;
    }
}
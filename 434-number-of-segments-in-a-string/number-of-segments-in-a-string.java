class Solution {
    public int countSegments(String s) {
    s=s.trim();
    if(s.isEmpty()){return 0;}
    String nums[]=s.split("\\s+");
    return nums.length;
     
    }
}
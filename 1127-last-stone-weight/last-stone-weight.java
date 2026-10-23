class Solution {
    public int lastStoneWeight(int[] stones) {
    List<Integer> lst = new ArrayList<>(stones.length);
    for (int x : stones) {lst.add(x);}
     while(lst.size()>1){
        lst.sort(Comparator.naturalOrder());
            int diff=lst.get(lst.size()-1)-lst.get(lst.size()-2);
            lst.remove(lst.size()-1);
            lst.remove(lst.size()-1);
            if(diff>0){lst.add(diff);}
     }
   if(!lst.isEmpty()){return  lst.get(0);  }
   else {return 0;}
    }}
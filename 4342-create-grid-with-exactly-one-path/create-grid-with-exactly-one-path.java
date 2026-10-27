class Solution {
    public String[] createGrid(int m, int n) {
      String a[]=new String[m];
      StringBuilder sb = new StringBuilder();
      int x=m;
      int y=n;
      while(y-->0){sb.append(".");}
      a[0]=sb.toString();
     sb=new StringBuilder();
      while(n-->1){sb.append("#");}
      sb.append(".");
      for(int i=1;i<x;i++){a[i]=sb.toString();}
      return a;
        }}
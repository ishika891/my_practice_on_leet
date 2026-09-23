class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst=new ArrayList<>();
        int minr=0;
        int maxr=matrix.length-1;
        int minc=0;
        int maxc=matrix[0].length-1;
        int e=0;
        int t=(matrix.length*matrix[0].length);
    while(e<t){
        for(int i=minc;i<=maxc&&e<t;i++){lst.add(matrix[minr][i]);
        e++;}
        minr++;
        for(int i=minr;i<=maxr&&e<t;i++){lst.add(matrix[i][maxc]);
        e++;}
        maxc--;
        for(int i=maxc;i>=minc&&e<t;i--){lst.add(matrix[maxr][i]);
        e++;}
        maxr--;
        for(int i=maxr;i>=minr&&e<t;i--){lst.add(matrix[i][minc]);
        e++;}
        minc++;
        
    }
    return lst;
    }
}
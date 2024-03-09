class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> l=new ArrayList<>();
         List<Integer> m=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r; i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    l.add(i);
                    m.add(j);
                }
            }
        }
        for(int x:l){
            for(int i=0;i<c;i++)
            {
                matrix[x][i]=0;
            }
        }
        for(int x:m){
            for(int i=0;i<r;i++){
                matrix[i][x]=0;
            }
        }
    }
}

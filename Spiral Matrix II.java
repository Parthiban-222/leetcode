class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int[n][n];
        int fr=0,fc=0,lr=n-1,lc=n-1;
        int num = 1;
        while(num<=n*n){
            for(int i=fr;i<=lc;i++){
                mat[fr][i]=num;
                num++;
            }
        
        for(int i=fr+1;i<=lr;i++){
            mat[i][lc]=num;
            num++;
        }
        if(fr!=lr){
            for(int i=lc-1;i>=fc;i--){
                mat[lr][i]=num;
                num++;
            }
        }
        if(fc!=lc){
            for(int i=lr-1;i>=fr+1;i--){
                mat[i][fc]=num;
                num++;
            }
        }
        fr++;fc++;
        lr--;lc--;
        }
        return mat;
    }
}

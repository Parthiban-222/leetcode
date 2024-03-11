class Solution {
   public List<List<String>> solveNQueens(int n) {
       boolean[][]grid = new boolean[n][n] ;
       List<List<String>> solutions = new ArrayList<>() ;
       solve(grid , 0 , solutions);
       return solutions ;
   }


   public void solve(boolean[][] grid , int row,List<List<String>> solutions){
       if(row == grid.length){
           solutions.add(display(grid)) ;
           return ;
       }
           for(int col = 0 ; col < grid.length ; col++){
               if(isSafe(grid,row,col))
               {
                   grid[row][col] = true ;
                   solve(grid,row+1,solutions) ;
                   grid[row][col] = false ;
               }
       }
   }


   public boolean isSafe(boolean[][]grid , int row , int col){
       for(int i = row-1 , j = col; i>= 0 ; i--){
           if(grid[i][j] == true){
               return false ;
           }
       }


       for(int i = row-1 , j = col-1 ; i >= 0 && j >= 0 ; i-- , j--){
           if(grid[i][j] == true)
           return false ;
       }


       for(int i = row-1 , j = col+1 ; i >= 0 && j < grid.length ; i--,j++){
           if(grid[i][j] == true ){
               return false ;
           }
       }
       return true ;
   }




   public List<String> display(boolean[][]grid ){
       List<String> list = new ArrayList<>() ;
       for(boolean[] arr : grid){
           StringBuilder row = new StringBuilder() ;
           for(boolean num : arr){
               if(num)
               row.append("Q");
               else
               row.append(".") ;
           }
           list.add(row.toString()) ;
       }
       return list ;
   }
}

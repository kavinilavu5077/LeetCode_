class Solution {
    public int[][] generateMatrix(int n) {
     int  matrix[][] = new int[n][n];
    int count=1;
        int sr=0,sc=0,er=matrix.length,ec=matrix[0].length;
                if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return matrix; 
        }
        while(sr<er &&  sc< ec){
            for(int i =sc;i<ec;i++){
                matrix[sr][i]=count++;
          
            }
            sr++;
            for(int i =sr;i<er;i++){
                matrix[i][ec-1]=count++;
               
            }
            ec--;
            if(sr<er){
            for(int i =ec-1;i>=sc;i--){
                matrix[er-1][i]=count++;
           
            }
            er--;
            }
            if(sc<ec){
            for(int i =er-1;i>=sr;i--){
             matrix[i][sc]=count++;
            }
            sc++;
            }            
        }
        return matrix;
    }
}
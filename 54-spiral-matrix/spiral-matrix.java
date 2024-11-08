class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int sr=0,sc=0,er=matrix.length,ec=matrix[0].length;
                if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return li; // Return empty list if matrix is empty
        }
        while(sr<er &&  sc< ec){
            for(int i =sc;i<ec;i++){
                 li.add(matrix[sr][i]);
            }
            sr++;
            for(int i =sr;i<er;i++){
                 li.add(matrix[i][ec-1]);
            }
            ec--;
            if(sr<er){
            for(int i =ec-1;i>=sc;i--){
              li.add(matrix[er-1][i]);
            }
            er--;
            }
            if(sc<ec){
            for(int i =er-1;i>=sr;i--){
              li.add(matrix[i][sc]);
            }
            sc++;
            }            
        }
        return li;
    }
}
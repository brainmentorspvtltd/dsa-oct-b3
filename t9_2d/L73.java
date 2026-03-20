public class L73 {
    
}
 class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        boolean[] row = new boolean[rowLength];
        // [True   False   False]
        boolean[] col = new boolean[colLength];
        // [True   False   False   True]

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        // First Transpose the Matrix 
       for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        // Then reversed each row 

        for (int[] row : matrix) {
            int start = 0;
            int end = row.length - 1;
            
            while (start < end) {
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                
                start++;
                end--;
            }
        }
        // return matrix;
    }
}

public class setMatrixZeros {
	
	public void setZeroes(int[][] matrix) {
        if (matrix == null)  return;
        int n = matrix[0].length;
        int m = matrix.length;
        int[] a = new int[n];
            for (int i=0; i<n; i++) {
                a[i] = 1;
            }
        int[] b = new int[m];
            for (int i=0; i<m; i++) {
                b[i] = 1;
            }
            
        for (int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    a[j] = 0;
                    b[i] = 0;
                }
            }
        }
        
        for (int i=0; i<m; i++) 
            for (int j = 0; j < n; j++)
                matrix[i][j] = matrix[i][j] * a[j] * b[i];
    }

}

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];
        int count = 1;
        for (int i = 0; i < m; i++){
            if (obstacleGrid[i][0] == 1){
                count = 0;
            }
            paths[i][0] = count;
        }
        count = 1;
        for (int i = 0; i < n; i++){
            if (obstacleGrid[0][i] == 1){
                count = 0;
            }
            paths[0][i] = count;
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (obstacleGrid[i][j] == 1){
                    paths[i][j] = 0;
                }else{
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
        }
        return paths[m - 1][n - 1];
    }
}

public class UniquePathII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = {{1,0,0}, {0,0,0}};
		System.out.print(uniquePathWithObstacle (a));
	}
	public static int uniquePathWithObstacle (int [][] obstacleGrid){
		if (obstacleGrid == null || obstacleGrid.length == 0){
			return 0;
		}
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int [][] path = new int [m][n];
		for (int i = 0; i < n; i ++){
			if (obstacleGrid [0][i] == 0){
				path [0][i] = 1;
			}
			else {
				path[0][i] = 0;
				break;
			}
		}
		for (int j = 0; j < m; j ++){
			if (obstacleGrid[j][0] == 0){
				path[j][0] = 1;
			}
			else {
				path[j][0] = 0;
			}
		}
		for (int i = 1; i < m; i ++){
			for (int j = 1; j < n; j ++){
				if (obstacleGrid[i][j] == 0){
				path [i][j] = path [i-1][j] + path[i][j-1];
				}
			}
		}
		return path [m-1][n-1];
	}

}

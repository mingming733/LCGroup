
public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 6;
		
		System.out.println(uniquePath (a, b));

	}
	public static int uniquePath (int m, int n){
		if (m == 0 || n == 0){
			return 0;
		}
		if (m == 1 || n == 1){
			return 1;
		}
		int [][]dp = new int [m][n];
		for (int i = 0; i < m; i ++){ //only left column
			dp [i][0] = 1; 
		}
		for (int j = 0; j < n; j ++){//only top row
			dp [0][j] = 1; 
		}
		for (int i = 1; i < m; i ++){
			for (int j = 1; j < n; j ++){
				dp [i][j] = dp [i-1][j] + dp [i][j-1];
			}
		}
		return dp [m-1][n-1];
			
	}

}


public class SpiralMatrixII {
	public static void main (String[]args){
		int number = 3;
		int [][]result = generateMatrix(number);
		for (int i = 0; i < 3; i ++){
			for (int j = 0; j < 3; j ++){
				System.out.println (result[i][j]);
			}
			System.out.println();
		}
		
	}
	public static int[][] generateMatrix(int n ){
		if (n < 0){
			return null;
		}
		int [][] result = new int [n][n];
		int row = 0; 
		int column = 0;
		int num = 1;
		while (n > 0){
			if (n == 1){
				result [row][column] = num++;
				break;
			}
			for (int i = 0; i < n -1; i ++){
				result [row][column + i] = num;
				num ++;
			}
			for (int i = 0; i < n -1; i ++){
				result [row + i][column + n -1] = num ++;
			}
			for (int i = 0; i < n -1; i ++){
				result [row + n -1][column + n - 1 - i] = num ++;
			}
			for (int i = 0; i < n -1; i ++){
				result [row + n -1 - i][column] = num ++;
			}
			n = n -2;
			row ++;
			column ++;
		}
		return result;
	}
}

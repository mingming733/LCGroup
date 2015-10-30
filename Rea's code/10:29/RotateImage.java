
public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {{1,2,3},{4,5,6}, {7,8,9}};
		for (int i = 0; i < matrix.length; i ++){
			for (int j = 0; j < matrix.length; j ++){
				rotateImage(matrix);
				System.out.print(matrix[i][j]);
			}
			
			
		}
	}
	public static void rotateImage (int [][] matrix){
		int len = matrix.length;
		for (int i = 0; i < len / 2; i ++){
			for (int j = 0; j < len; j ++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix [len -1 -i][j];
				matrix [len -1 - i][j] = temp;
			}
			
		}
		for (int i = 0; i< len; i ++ ){
			for (int j = i + 1; j < len; j ++){
				int temp = matrix [i][j];
				matrix [i][j] = matrix [j][i];
				matrix[j][i] = temp;
			}
		}
		
	}

}

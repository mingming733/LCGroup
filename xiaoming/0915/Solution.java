public class Solution {
	public static void main(String[] args) {
		// test
		int[] nums = {0,1,1,1,2,3,3,4,5,6,7,8};
		int position = binarySearch(nums, 3);
		for (int i = 0; i < 1; i++)
			System.out.println(position + " ");
		// test
		System.out.println("T or F : " + isUnique("Hhhh"));
		// test
		System.out.println(uniquePath (4, 6));
		// test
		int[][] obstacleGrid = {{0,1,0,0},{0,0,0,0},{0,1,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
	
	//  binarySearch
	static int binarySearch(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		if (target < array[start] || target > array[end]) return -1;
		return binarySearchHelp(array, target, start, end);
	}
	
	static int binarySearchHelp(int[] array, int target,int start, int end) {
		if (end < start) return -1;
		int mid = (end + start)/2;
		if (target == array[start]) return start;
		else if (target > array[start] && target <= array[mid])
		{
			return binarySearchHelp(array,target,start,mid);
		}
		else {
			return binarySearchHelp(array,target,mid + 1,end);
		}
	}
	
	//  Unique
	static boolean isUnique(String str) {
		if (str == null)  return true;
		for (int i = 0; i < str.length(); i ++)
			for (int j = i + 1; j < str.length(); j ++)
				if ( str.charAt(i) == str.charAt(j) )  return false;	
		return true;
	}
	
	//  uniquePath 1
	static int uniquePath (int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}
		if (m == 1 || n == 1) {
			return 1;
		}		
		int[][] path = new int [m][n];
		for (int i = 0; i < m; i ++) { 
			path[i][0] = 1; 
		}
		for (int j = 0; j < n; j ++) {
			path[0][j] = 1; 
		}
		for (int i = 1; i < m; i ++) {
			for (int j = 1; j < n; j ++) {
				path[i][j] = path[i-1][j] + path[i][j-1];
			}
		}
		return path[m-1][n-1];			
	}
	
	//  uniquePath 2
	static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null || obstacleGrid.length == 0) return 0;
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if (m == 1 || n == 1) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (obstacleGrid[i][j] == 1)  return 0;
				}
			}
			return 1;
		}	
		int[][] path = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				path[i][j] = 0;
			}
		}
		for (int i = 0; i < n; i ++) {
			if (obstacleGrid[0][i] == 0) {
				path[0][i] = 1;
			}
			else break;
		}
		for (int j = 0; j < m; j ++) {
			if (obstacleGrid[j][0] == 0) {
				path[j][0] = 1;
			}
			else break;
		}
		for (int i = 1; i < m; i ++) {
			for (int j = 1; j < n; j ++) {
				if (obstacleGrid[i][j] == 0) {
				path [i][j] = path [i-1][j] + path[i][j-1];
				}
			}
		}
		return path [m-1][n-1];
	}
	
}
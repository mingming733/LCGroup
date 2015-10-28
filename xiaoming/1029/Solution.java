import java.util.*;
public class Solution {

	public int maxArea(int[] height) {
        if (height == null || height.length <= 1) return 0;
        int maxA = 0;
        int l = 0;
        int r = height.length -1;
        while (l < r) {
            maxA = Math.max(maxA, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return maxA;
    }
//////////////////////	
	
	public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) return;
        int n = matrix.length;
        for (int i=0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
//////////////////////	
	
	public int[][] generateMatrix(int n) {
        int length = Math.abs(n);
        int[][] matrix = new int[length][length];
        if (length == 0) return matrix;
        if (length == 1) {
            matrix[0][0] = 1;
            return matrix;
        }
        for (int i = 0; i < length/2 ; i++) {
            for (int j = i; j < length - 1 - i; j++) {
                if(j == 0) matrix[i][j] = 1;
                else matrix[i][j] = matrix[i][j-1] + 1;
                matrix[j][length-i-1] = matrix[i][j] + length - 1 - 2*i;
                matrix[length-i-1][length-j-1] = matrix[j][length-i-1] + length - 1 - 2*i;
                matrix[length-j-1][i] = matrix[length-i-1][length-j-1] + length - 1 - 2*i;
            }
        }
        if (length % 2 == 1) matrix[length/2][length/2] = length * length;
        return matrix;
    }
//////////////////////
	public List<List<Integer>> permuteUnique(int[] nums) {  
	    List<List<Integer>> res = new LinkedList<List<Integer>>();  
	    if(nums ==null || nums.length==0)  
	        return res;  
	    Arrays.sort(nums);
	    boolean[] used= new boolean[nums.length];
	    for (int i = 0; i < nums.length; i++) used[i] = false;
	    helper(nums, used, new LinkedList<Integer>(), res);  
	    return res;  
	}  
	public void helper(int[] num, boolean[] used, LinkedList<Integer> item, List<List<Integer>> res)  
	{  
	    if(item.size() == num.length)  
	    {  
	        res.add(new LinkedList<Integer>(item));  
	        return;  
	    }  
	    for(int i=0; i<num.length; i++)  
	    {  
	        if(i>0 && !used[i-1] && num[i]==num[i-1]) continue;  
	        if(!used[i])  
	        {  
	            used[i] = true;  
	            item.add(num[i]);  
	            helper(num, used, item, res);  
	            item.remove(item.size()-1);  
	            used[i] = false;  
	        }  
	    }  
	}  	
}

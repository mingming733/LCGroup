
public class Solution {
	
	public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i-1];
        }
        for(int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for(int i = 1; i < m ; i++) 
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
            }
        return grid[m-1][n-1];
    }
	
///////////////////////	
	
	public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = new ListNode(0);
        pre.next = head.next;
        ListNode link = head;
        while (head != null && head.next != null) {
            link.next = head.next;
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = head;
            head = head.next;
            link = temp.next;
        }
        return pre.next;
    }
	
///////////////////////	
	
	public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0 ) return;
        int red = 0; 
        int white = 0;
        int blue = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) red++;
            else if (nums[i] == 1) white++;
            else blue++;
        }
        for(int i = 0; i < nums.length; i++) {
            if (red != 0) {
                nums[i] = 0;
                red--;
            }
            else if (white != 0) {
                nums[i] = 1;
                white--;
            }
            else nums[i] = 2;
        }
    }
	
///////////////////////	
	public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<String>();
        if (n <= 0) return res;
        helper(n,n,"",res);
        return res;
    }
    public void helper(int l, int r, String str, List<String> res) {
        if (l > r) return;
        if (l == 0 && r == 0) res.add(str);
        if (l > 0) helper(l-1, r, str+"(",res);
        if (r>0) helper(l, r-1, str+")", res);
    }
	
	

}

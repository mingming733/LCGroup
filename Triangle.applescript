public class Solution {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        return helper(triangle, 0, 0);
    }
    private int helper(ArrayList<ArrayList<Integer>> triangle, int x, int y){
        int sum = triangle.get(x).get(y);
        if (x == triangle.size() - 1){
            return sum;
        }
        sum = Math.min(helper(triangle, x + 1, y), helper(triangle, x + 1, y + 1) ) + sum;
        return sum;
    }
}


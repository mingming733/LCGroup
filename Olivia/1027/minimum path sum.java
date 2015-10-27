public class Solution {
    public int minPathSum(int[][] grid) {
   if(grid ==null ||grid.length==0 ||grid[0].length==0){
   return 0;
    }
    int x=grid.length;
    int y=grid[0].length;
    int[][] sum=new int[x][y];
    sum[0][0] = grid[0][0];
    for(int i=1;i<x;i++){
        sum[i][0]=sum[i-1][0]+grid[i][0];
    }
    for(int i=1;i<y;i++){
        sum[0][i]=sum[0][i-1]+grid[0][i];
    }
    for(int i=1;i<x;i++){
        for(int j=1;j<y;j++){
            sum[i][j]=Math.min(sum[i-1][j],sum[i][j-1])+grid[i][j];
        }
    }
    return sum[x-1][y-1];
    }
}

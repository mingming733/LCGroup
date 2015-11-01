public class Solution {
    public int[][] generateMatrix(int n) {
        if(n<0){
            return null;
        }
        int[][] rst= new int[n][n];
        int x=0,y=0,num=1;
        while(n>0){
            if(n==1){
                rst[y][x]=num++;
                break;
            }
            for(int i=0;i<n-1;i++){
                rst[y][x+i]=num++;
            }
            for(int i=0;i<n-1;i++){
                rst[y+i][x+n-1]=num++;
            }
            for(int i=0;i<n-1;i++){
                rst[y+n-1][x+n-1-i]=num++;
            }
            for(int i=0;i<n-1;i++){
                rst[y+n-1-i][x]=num++;
            }
            x++;
            y++;
            n=n-2;
        }
        return rst;
    }
}

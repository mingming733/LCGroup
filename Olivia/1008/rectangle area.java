public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(A>C || B>D || E>G || F>H){
            return 0;
        }
        int x=(C-A)*(D-B);
        int y=(G-E)*(H-F);
        int m=Math.min(C,G)-Math.max(A,E);
        int n=Math.min(D,H)-Math.max(B,F);
        if(B>=H || A>=G || E>=C || F>=D)
        {
            return x+y;
        }
        else{
       return x+y-m*n;
        }
    }
}

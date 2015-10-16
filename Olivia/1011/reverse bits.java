public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rst=0;
        for(int i=0;i<32;i++){
            if((n & 1)==1){
                rst=(rst<<1)+1;
            }
            else{
                rst=(rst<<1);
            }
            n=(n>>1);
        }
        return rst;
    }
}

//if n is power of two, only one bit is 1
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
            
        }
            else
            {
                return (n&(n-1)) ==0;
            }
        
    }
}

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



public class Solution {
    public boolean isPowerOfTwo(int n) {
        double m=n;
        while(m>=1.0){
        if(m==1.0){
            return true;
        }
         m=m/2.0;
        }
        return false;
    }
}

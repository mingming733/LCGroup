
public class NumberOf1bits {
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int toAnd = 1 << 31;
        int res = 0;
        for (int i= 0; i < 32; i++) {
            if (((n << i) & toAnd) == toAnd) res++;
        }
        return res;
    }

}


public class ReverseBits {
	// you need treat n as an unsigned value
    public int reverseBitsF(int n) {
        
        int toXor = 1 << 31;
        int swapLow = 0;
        int swapHigh = 0;
        
        for (int i = 0; i<16; i++) {
            swapLow = (n << (32 - i + 1)) & toXor;
            swapHigh = (n << i) & toXor;
            if ((swapLow ^ swapHigh) == toXor) 
                n ^= ((1 << i) ^ (1 << (32 - i + 1)));
        }
        return n;
    }

}


public class ReverseInteger {
	public int reverse(int x) {
        int res = 0;
        while (x != 0) {
        	if (res != 0 && Integer.MAX_VALUE / res < 10 && Integer.MAX_VALUE /res > -10)
        		return 0;
        res = res *10 + x % 10;
        x /= 10;
        }
        return res;
    }
}

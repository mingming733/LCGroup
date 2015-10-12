
public class FactorialTrailingZeroes {
	
	int zeros(int n) {
		if (n <= 0) return 0;
		int res = 0;
		int factor = 5;
		while (factor <= n) {
			res += n/factor;
			factor *= 5;
		}
		return res;
	}

}

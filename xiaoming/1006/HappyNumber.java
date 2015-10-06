import java.util.HashSet;


public class HappyNumber {
	public boolean isHappy(int n) {
		
		if (n < 0) return false;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while (!set.contains(n)) {
			set.add(n);
			int sum = 0;
			while (n != 0) {
				int digit = n % 10;
				n /= 10;
				sum += Math.pow(digit, 2);
			}
			n = sum;
			if (sum == 1)
				return true;
		}
		
		return false;
	}
}

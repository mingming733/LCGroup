
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
        double number = n;
        while (number >= 1.0) {
            if (number == 1.0) return true;
            number /= 2;
        }
        return false;
    }
}
